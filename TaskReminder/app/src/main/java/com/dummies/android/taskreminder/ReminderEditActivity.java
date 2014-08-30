package com.dummies.android.taskreminder;

import android.app.Fragment;

public class ReminderEditActivity extends SingleFragmentActivity
        implements OnFinishEditor {

    @Override
    protected Fragment newFragmentInstance() {

        // Create a new fragment and pass along arguments (like
        // COLUMN_TASKID) from the activity to the fragment
        Fragment fragment = new ReminderEditFragment();
        fragment.setArguments(getIntent().getExtras());
        return fragment;
    }

    @Override
    public void finishEditor() {
        // When the user dismisses the editor, call finish to destroy
        // this activity.
        finish();
    }
}
