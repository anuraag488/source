package com.google.android.play.core.hsdp.model;

/* JADX INFO: renamed from: com.google.android.play.core.hsdp.model.e */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0539e extends EngagementPanelDisplayConfig {

    /* JADX INFO: renamed from: a */
    public float f16280a;

    /* JADX INFO: renamed from: b */
    public float f16281b;

    /* JADX INFO: renamed from: c */
    public float f16282c;

    /* JADX INFO: renamed from: d */
    public LayoutGravity f16283d;

    /* JADX INFO: renamed from: e */
    public CornerStyle f16284e;

    @Override // com.google.android.play.core.hsdp.model.EngagementPanelDisplayConfig
    public final float callerHeightRatio() {
        return this.f16280a;
    }

    @Override // com.google.android.play.core.hsdp.model.EngagementPanelDisplayConfig
    public final float callerWidthRatio() {
        return this.f16281b;
    }

    @Override // com.google.android.play.core.hsdp.model.EngagementPanelDisplayConfig
    public final CornerStyle cornerStyle() {
        return this.f16284e;
    }

    @Override // com.google.android.play.core.hsdp.model.EngagementPanelDisplayConfig
    public final float dismissThreshold() {
        return this.f16282c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EngagementPanelDisplayConfig) {
            EngagementPanelDisplayConfig engagementPanelDisplayConfig = (EngagementPanelDisplayConfig) obj;
            if (Float.floatToIntBits(this.f16280a) == Float.floatToIntBits(engagementPanelDisplayConfig.callerHeightRatio()) && Float.floatToIntBits(this.f16281b) == Float.floatToIntBits(engagementPanelDisplayConfig.callerWidthRatio()) && Float.floatToIntBits(this.f16282c) == Float.floatToIntBits(engagementPanelDisplayConfig.dismissThreshold()) && this.f16283d.equals(engagementPanelDisplayConfig.landscapeAnchoring()) && this.f16284e.equals(engagementPanelDisplayConfig.cornerStyle())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = ((((((Float.floatToIntBits(this.f16280a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f16281b)) * 1000003) ^ Float.floatToIntBits(this.f16282c)) * 1000003) ^ this.f16283d.hashCode();
        return this.f16284e.hashCode() ^ (iFloatToIntBits * 1000003);
    }

    @Override // com.google.android.play.core.hsdp.model.EngagementPanelDisplayConfig
    public final LayoutGravity landscapeAnchoring() {
        return this.f16283d;
    }

    @Override // com.google.android.play.core.hsdp.model.EngagementPanelDisplayConfig
    public final EngagementPanelDisplayConfig.Builder toBuilder() {
        C0538d c0538d = new C0538d();
        c0538d.f16274a = callerHeightRatio();
        c0538d.f16275b = callerWidthRatio();
        c0538d.f16276c = dismissThreshold();
        c0538d.f16277d = landscapeAnchoring();
        c0538d.f16278e = cornerStyle();
        c0538d.f16279f = (byte) 7;
        return c0538d;
    }

    public final String toString() {
        CornerStyle cornerStyle = this.f16284e;
        return "EngagementPanelDisplayConfig{callerHeightRatio=" + this.f16280a + ", callerWidthRatio=" + this.f16281b + ", dismissThreshold=" + this.f16282c + ", landscapeAnchoring=" + this.f16283d.toString() + ", cornerStyle=" + cornerStyle.toString() + '}';
    }
}
