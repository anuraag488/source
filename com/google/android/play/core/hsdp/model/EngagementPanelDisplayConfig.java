package com.google.android.play.core.hsdp.model;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class EngagementPanelDisplayConfig {
    public static final float DEFAULT_CALLER_HEIGHT_RATIO = 0.6f;
    public static final float DEFAULT_CALLER_WIDTH_RATIO = 0.6f;
    public static final float DEFAULT_DISMISS_THRESHOLD = 0.2f;
    public static final int MIN_WIDTH_DP = 380;

    /* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
    public static abstract class Builder {
        public abstract EngagementPanelDisplayConfig autoBuild();

        public EngagementPanelDisplayConfig build() {
            EngagementPanelDisplayConfig engagementPanelDisplayConfigAutoBuild = autoBuild();
            if (Float.isNaN(engagementPanelDisplayConfigAutoBuild.callerHeightRatio()) || engagementPanelDisplayConfigAutoBuild.callerHeightRatio() <= 0.0f || engagementPanelDisplayConfigAutoBuild.callerHeightRatio() > 1.0f) {
                throw new IllegalArgumentException("callerHeightRatio must be in (0.0, 1.0], got " + engagementPanelDisplayConfigAutoBuild.callerHeightRatio());
            }
            if (Float.isNaN(engagementPanelDisplayConfigAutoBuild.callerWidthRatio()) || engagementPanelDisplayConfigAutoBuild.callerWidthRatio() <= 0.0f || engagementPanelDisplayConfigAutoBuild.callerWidthRatio() > 1.0f) {
                throw new IllegalArgumentException("callerWidthRatio must be in (0.0, 1.0], got " + engagementPanelDisplayConfigAutoBuild.callerWidthRatio());
            }
            if (!Float.isNaN(engagementPanelDisplayConfigAutoBuild.dismissThreshold()) && engagementPanelDisplayConfigAutoBuild.dismissThreshold() >= 0.0f && engagementPanelDisplayConfigAutoBuild.dismissThreshold() < engagementPanelDisplayConfigAutoBuild.callerHeightRatio()) {
                return engagementPanelDisplayConfigAutoBuild;
            }
            throw new IllegalArgumentException("dismissThreshold must be in [0.0, callerHeightRatio), got dismissThreshold=" + engagementPanelDisplayConfigAutoBuild.dismissThreshold() + " and callerHeightRatio=" + engagementPanelDisplayConfigAutoBuild.callerHeightRatio());
        }

        public abstract Builder setCallerHeightRatio(float f);

        public abstract Builder setCallerWidthRatio(float f);

        public abstract Builder setCornerStyle(CornerStyle cornerStyle);

        public abstract Builder setDismissThreshold(float f);

        public abstract Builder setLandscapeAnchoring(LayoutGravity layoutGravity);
    }

    public static Builder builder() {
        C0538d c0538d = new C0538d();
        c0538d.setCallerHeightRatio(0.6f);
        c0538d.setCallerWidthRatio(0.6f);
        c0538d.setDismissThreshold(0.2f);
        c0538d.setLandscapeAnchoring(LayoutGravity.START);
        c0538d.setCornerStyle(CornerStyle.DEFAULT);
        return c0538d;
    }

    public abstract float callerHeightRatio();

    public abstract float callerWidthRatio();

    public abstract CornerStyle cornerStyle();

    public abstract float dismissThreshold();

    public abstract LayoutGravity landscapeAnchoring();

    public abstract Builder toBuilder();
}
