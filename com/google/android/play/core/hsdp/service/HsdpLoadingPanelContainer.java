package com.google.android.play.core.hsdp.service;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class HsdpLoadingPanelContainer extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Runnable f16298a;

    public HsdpLoadingPanelContainer(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Runnable runnable = this.f16298a;
        if (runnable != null) {
            removeCallbacks(runnable);
            post(this.f16298a);
        }
    }

    public void setOnConfigurationChangedListener(Runnable runnable) {
        this.f16298a = runnable;
    }

    public HsdpLoadingPanelContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
