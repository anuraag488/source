package com.google.android.play.core.hsdp.model;

import p000.C1077qn;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class InlineInstallsDisplayConfig {

    /* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
    public static abstract class Builder {
        public abstract InlineInstallsDisplayConfig autoBuild();

        public InlineInstallsDisplayConfig build() {
            InlineInstallsDisplayConfig inlineInstallsDisplayConfigAutoBuild = autoBuild();
            if (inlineInstallsDisplayConfigAutoBuild.bottomSheet() == null || inlineInstallsDisplayConfigAutoBuild.engagementPanel() == null) {
                return inlineInstallsDisplayConfigAutoBuild;
            }
            C1077qn.m9987m("InlineInstallsDisplayConfig cannot configure both bottomSheet and engagementPanel.");
            return null;
        }

        public abstract Builder setBottomSheet(BottomSheetDisplayConfig bottomSheetDisplayConfig);

        public abstract Builder setEngagementPanel(EngagementPanelDisplayConfig engagementPanelDisplayConfig);
    }

    public static Builder builder() {
        return new C0542h();
    }

    public static InlineInstallsDisplayConfig forBottomSheet(BottomSheetDisplayConfig bottomSheetDisplayConfig) {
        Builder builder = builder();
        builder.setBottomSheet(bottomSheetDisplayConfig);
        return builder.build();
    }

    public static InlineInstallsDisplayConfig forEngagementPanel(EngagementPanelDisplayConfig engagementPanelDisplayConfig) {
        Builder builder = builder();
        builder.setEngagementPanel(engagementPanelDisplayConfig);
        return builder.build();
    }

    public abstract BottomSheetDisplayConfig bottomSheet();

    public abstract EngagementPanelDisplayConfig engagementPanel();
}
