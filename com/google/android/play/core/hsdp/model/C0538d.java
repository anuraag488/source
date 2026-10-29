package com.google.android.play.core.hsdp.model;

import java.lang.invoke.VarHandle;
import p000.C1077qn;
import p000.xy4;

/* JADX INFO: renamed from: com.google.android.play.core.hsdp.model.d */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0538d extends EngagementPanelDisplayConfig.Builder {

    /* JADX INFO: renamed from: a */
    public float f16274a;

    /* JADX INFO: renamed from: b */
    public float f16275b;

    /* JADX INFO: renamed from: c */
    public float f16276c;

    /* JADX INFO: renamed from: d */
    public LayoutGravity f16277d;

    /* JADX INFO: renamed from: e */
    public CornerStyle f16278e;

    /* JADX INFO: renamed from: f */
    public byte f16279f;

    @Override // com.google.android.play.core.hsdp.model.EngagementPanelDisplayConfig.Builder
    public final EngagementPanelDisplayConfig autoBuild() {
        LayoutGravity layoutGravity;
        CornerStyle cornerStyle;
        if (this.f16279f == 7 && (layoutGravity = this.f16277d) != null && (cornerStyle = this.f16278e) != null) {
            float f = this.f16274a;
            float f2 = this.f16275b;
            float f3 = this.f16276c;
            C0539e c0539e = new C0539e();
            c0539e.f16280a = f;
            c0539e.f16281b = f2;
            c0539e.f16282c = f3;
            c0539e.f16283d = layoutGravity;
            c0539e.f16284e = cornerStyle;
            VarHandle.storeStoreFence();
            return c0539e;
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f16279f & 1) == 0) {
            sb.append(" callerHeightRatio");
        }
        if ((this.f16279f & 2) == 0) {
            sb.append(" callerWidthRatio");
        }
        if ((this.f16279f & 4) == 0) {
            sb.append(" dismissThreshold");
        }
        if (this.f16277d == null) {
            sb.append(" landscapeAnchoring");
        }
        if (this.f16278e == null) {
            sb.append(" cornerStyle");
        }
        C1077qn.m9989o("Missing required properties:".concat(sb.toString()));
        return null;
    }

    @Override // com.google.android.play.core.hsdp.model.EngagementPanelDisplayConfig.Builder
    public final EngagementPanelDisplayConfig.Builder setCallerHeightRatio(float f) {
        this.f16274a = f;
        this.f16279f = (byte) (this.f16279f | 1);
        return this;
    }

    @Override // com.google.android.play.core.hsdp.model.EngagementPanelDisplayConfig.Builder
    public final EngagementPanelDisplayConfig.Builder setCallerWidthRatio(float f) {
        this.f16275b = f;
        this.f16279f = (byte) (this.f16279f | 2);
        return this;
    }

    @Override // com.google.android.play.core.hsdp.model.EngagementPanelDisplayConfig.Builder
    public final EngagementPanelDisplayConfig.Builder setCornerStyle(CornerStyle cornerStyle) {
        if (cornerStyle != null) {
            this.f16278e = cornerStyle;
            return this;
        }
        xy4.m12782k("Null cornerStyle");
        return null;
    }

    @Override // com.google.android.play.core.hsdp.model.EngagementPanelDisplayConfig.Builder
    public final EngagementPanelDisplayConfig.Builder setDismissThreshold(float f) {
        this.f16276c = f;
        this.f16279f = (byte) (this.f16279f | 4);
        return this;
    }

    @Override // com.google.android.play.core.hsdp.model.EngagementPanelDisplayConfig.Builder
    public final EngagementPanelDisplayConfig.Builder setLandscapeAnchoring(LayoutGravity layoutGravity) {
        if (layoutGravity != null) {
            this.f16277d = layoutGravity;
            return this;
        }
        xy4.m12782k("Null landscapeAnchoring");
        return null;
    }
}
