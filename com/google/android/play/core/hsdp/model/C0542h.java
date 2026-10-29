package com.google.android.play.core.hsdp.model;

import java.lang.invoke.VarHandle;
import p000.dp6;

/* JADX INFO: renamed from: com.google.android.play.core.hsdp.model.h */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0542h extends InlineInstallsDisplayConfig.Builder {

    /* JADX INFO: renamed from: a */
    public BottomSheetDisplayConfig f16296a;

    /* JADX INFO: renamed from: b */
    public EngagementPanelDisplayConfig f16297b;

    @Override // com.google.android.play.core.hsdp.model.InlineInstallsDisplayConfig.Builder
    public final InlineInstallsDisplayConfig autoBuild() {
        BottomSheetDisplayConfig bottomSheetDisplayConfig = this.f16296a;
        EngagementPanelDisplayConfig engagementPanelDisplayConfig = this.f16297b;
        dp6 dp6Var = new dp6();
        dp6Var.f17273a = bottomSheetDisplayConfig;
        dp6Var.f17274b = engagementPanelDisplayConfig;
        VarHandle.storeStoreFence();
        return dp6Var;
    }

    @Override // com.google.android.play.core.hsdp.model.InlineInstallsDisplayConfig.Builder
    public final InlineInstallsDisplayConfig.Builder setBottomSheet(BottomSheetDisplayConfig bottomSheetDisplayConfig) {
        this.f16296a = bottomSheetDisplayConfig;
        return this;
    }

    @Override // com.google.android.play.core.hsdp.model.InlineInstallsDisplayConfig.Builder
    public final InlineInstallsDisplayConfig.Builder setEngagementPanel(EngagementPanelDisplayConfig engagementPanelDisplayConfig) {
        this.f16297b = engagementPanelDisplayConfig;
        return this;
    }
}
