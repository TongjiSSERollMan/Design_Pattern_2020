package com.github.tongjisserollman.iceamusementpark;

import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.TestIdentifier;
import org.junit.platform.launcher.TestPlan;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;

import java.util.Scanner;
import java.util.Set;

import static org.junit.platform.engine.discovery.DiscoverySelectors.selectPackage;
import static org.junit.platform.engine.discovery.ClassNameFilter.includeClassNamePatterns;
/**
 * @author rand1925
 *
 * 测试主类，提供简单的交互界面
 */
public class Main {

    /**
     * 展示用例选单
     *
     * @param args 没有作用
     */
    public static void main(String[] args) {
        LauncherDiscoveryRequestBuilder requestBuilder = LauncherDiscoveryRequestBuilder.request()
                .selectors(selectPackage(Main.class.getPackageName()))
                .filters(includeClassNamePatterns(".*Test"));
        LauncherDiscoveryRequest allTestRequest = requestBuilder.build();
        Launcher launcher = LauncherFactory.create();
        TestPlan testPlan = launcher.discover(allTestRequest);
        Set<TestIdentifier> testIdentifierSet = testPlan.getChildren("[engine:junit-jupiter]");
        TestIdentifier[] testIdentifierArray = testIdentifierSet.toArray(TestIdentifier[]::new);
        for (int i = 0; i < testIdentifierArray.length; ++i) {
            System.out.printf("%2d: %s\n", i, testIdentifierArray[i].getDisplayName());
        }
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("输入一个数字选择特定测试， -1退出");
            int choice = scanner.nextInt();
            if (choice == -1) {
                break;
            }
            if (choice < 0 || choice >= testIdentifierArray.length) {
                System.out.println("越界！");
                continue;
            }
            TestIdentifier chosenTestIdentifier = testIdentifierArray[choice];
            System.out.printf("正在执行测试%2d: %s\n", choice, chosenTestIdentifier.getDisplayName());
            LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
                    .selectors(selectPackage(Main.class.getPackageName()))
                    .filters(includeClassNamePatterns(chosenTestIdentifier.getLegacyReportingName()))
                    .build();
            launcher.execute(request);
        }
    }
}

