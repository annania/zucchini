/**
 * Copyright 2014 Comcast Cable Communications Management, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.comcast.zucchini

import cucumber.api.CucumberOptions


@CucumberOptions(
    glue     = ["com.comcast.zucchini.glue"],
    features = ["src/test/resources"]
)
@ZucchiniOutput()
class ParallelZucchiniCukesTest extends AbstractZucchiniTest {

    @Override
    public List<TestContext> getTestContexts() {
        List<TestContext> contexts = []
        
        contexts.push(new TestContext('asparagus', [veggie : new Veggie()]))
        contexts.push(new TestContext('carrots',   [veggie : new Veggie()]))
        contexts.push(new TestContext('cabbages',  [veggie : new Veggie()]))
        contexts.push(new TestContext('onions',    [veggie : new Veggie()]))
        contexts.push(new TestContext('celery',    [veggie : new Veggie()]))
        contexts.push(new TestContext('turnips',   [veggie : new Veggie()]))
        
        return contexts
    }
    
    
}