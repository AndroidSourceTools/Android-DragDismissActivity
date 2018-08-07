/*
 * Copyright (C) 2017 Luke Klinker
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

package xyz.klinker.drag_dismiss;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import xyz.klinker.android.drag_dismiss.DragDismissIntentBuilder;

public class SampleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        findViewById(R.id.scrollable).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent scrollable = new Intent(SampleActivity.this, DismissableActivityNormalContent.class);

                new DragDismissIntentBuilder(SampleActivity.this)
                        .setTheme(DragDismissIntentBuilder.Theme.LIGHT)
                        .setPrimaryColorResource(R.color.colorPrimary)
                        .setToolbarTitle("Normal Activity Sample")
                        .build(scrollable);

                startActivity(scrollable);
            }
        });

        findViewById(R.id.scrollable_progress).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent scrollable = new Intent(SampleActivity.this, DismissableActivityNormalContent.class);

                new DragDismissIntentBuilder(SampleActivity.this)
                        .setTheme(DragDismissIntentBuilder.Theme.LIGHT)
                        .setPrimaryColorResource(R.color.colorPrimary)
                        .setToolbarTitle("Normal Activity Sample")
                        .build(scrollable);

                scrollable.putExtra(DismissableActivityNormalContent.EXTRA_SHOW_PROGRESS, true);

                startActivity(scrollable);
            }
        });

        findViewById(R.id.recycler).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent recycler = new Intent(SampleActivity.this, DismissableActivityRecyclerView.class);

                new DragDismissIntentBuilder(SampleActivity.this)
                        .setTheme(DragDismissIntentBuilder.Theme.LIGHT)
                        .setPrimaryColorResource(R.color.colorPrimary)
                        .setShowToolbar(true)
                        .setToolbarTitle("RecyclerView Sample")
                        .build(recycler);

                startActivity(recycler);
            }
        });

        findViewById(R.id.black).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent scrollable = new Intent(SampleActivity.this, DismissableActivityNormalContent.class);

                new DragDismissIntentBuilder(SampleActivity.this)
                        .setTheme(DragDismissIntentBuilder.Theme.BLACK)
                        .setToolbarTitle("Black Sample")
                        .build(scrollable);

                startActivity(scrollable);
            }
        });

        findViewById(R.id.dark).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent scrollable = new Intent(SampleActivity.this, DismissableActivityNormalContent.class);

                new DragDismissIntentBuilder(SampleActivity.this)
                        .setTheme(DragDismissIntentBuilder.Theme.DARK)
                        .setToolbarTitle("Dark Sample")
                        .setDragElasticity(DragDismissIntentBuilder.DragElasticity.LARGE)
                        .build(scrollable);

                startActivity(scrollable);
            }
        });

        findViewById(R.id.dark_colored).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent scrollable = new Intent(SampleActivity.this, DismissableActivityNormalContent.class);

                new DragDismissIntentBuilder(SampleActivity.this)
                        .setTheme(DragDismissIntentBuilder.Theme.DARK)
                        .setPrimaryColorResource(R.color.colorPrimary)
                        .setToolbarTitle("Dark and Colored Sample")
                        .setDragElasticity(DragDismissIntentBuilder.DragElasticity.XLARGE)
                        .build(scrollable);

                startActivity(scrollable);
            }
        });

        findViewById(R.id.hide_toolbar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent scrollable = new Intent(SampleActivity.this, DismissableActivityNormalContent.class);

                new DragDismissIntentBuilder(SampleActivity.this)
                        .setTheme(DragDismissIntentBuilder.Theme.LIGHT)
                        .setPrimaryColorResource(R.color.colorPrimary)
                        .setShowToolbar(false)
                        .setFullscreenOnTablets(true)
                        .setToolbarTitle("Hidden Toolbar Sample")
                        .setDragElasticity(DragDismissIntentBuilder.DragElasticity.XXLARGE)
                        .build(scrollable);

                startActivity(scrollable);
            }
        });
    }
}


