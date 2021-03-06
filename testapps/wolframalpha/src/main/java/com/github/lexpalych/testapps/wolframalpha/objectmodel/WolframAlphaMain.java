package com.github.lexpalych.testapps.wolframalpha.objectmodel;

import com.github.lexpalych.extensions.allure.webdriver.WebDriverPageObject;
import com.github.lexpalych.extensions.junit5.allure.steps.steprepositories.ButtonStepRepository;
import com.github.lexpalych.extensions.junit5.allure.steps.steprepositories.FieldStepRepository;

public class WolframAlphaMain extends WebDriverPageObject<WolframAlphaMain>
        implements FieldStepRepository<WolframAlphaMain>, ButtonStepRepository<WolframAlphaMain> {
    private static final String CONTEXT = "//input[@placeholder='Enter what you want to calculate or know about']/../../../../../..";

    @Override
    public WolframAlphaMain clickButton(final String name) {
        click(CONTEXT + "//button[@aria-label='" + name + "']");
        return this;
    }

    @Override
    public WolframAlphaMain fillField(final String name, final String value) {
        sendKeys(CONTEXT + "//input[@placeholder='" + name + "']", value);
        return this;
    }
}
