package com.google.android.libraries.ads.mobile.sdk.common;

import ads_mobile_sdk.AbstractC0137h;
import ads_mobile_sdk.C0211l0;
import ads_mobile_sdk.C0245n0;
import ads_mobile_sdk.sg0;
import ads_mobile_sdk.sy3;
import ads_mobile_sdk.vx3;
import ads_mobile_sdk.z01;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import p000.ab5;
import p000.ag0;
import p000.t82;
import p000.wm0;
import p000.wp4;
import p000.x45;
import p000.zo0;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class AdActivity extends ag0 {

    /* JADX INFO: renamed from: v */
    public ab5 f16261v;

    @Override // p000.ag0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        x45.f33989a.getClass();
        if (z01.f13968b.f13023a == null) {
            finish();
            return;
        }
        Bundle extras = getIntent().getExtras();
        wm0 wm0Var = null;
        Integer numValueOf = (extras == null || (bundle2 = extras.getBundle("ad_activity_delegate_bundle")) == null) ? null : Integer.valueOf(bundle2.getInt("ad_activity_delegate"));
        if (numValueOf == null) {
            ((vx3) ((sg0) z01.m2787a()).f11302H.get()).m2570a("AdActivityMissingDelegateKey", new Exception("AdActivityMissingDelegateKey"));
            AbstractC0137h.m1108a("Could not retrieve AdActivityDelegate key", (Throwable) null);
            finish();
            return;
        }
        C0211l0 c0211l0 = (C0211l0) ((C0245n0) ((sg0) z01.m2787a()).f11401Z.get()).f7452d.remove(numValueOf);
        if (c0211l0 != null) {
            c0211l0.f6562b.mo4993a(null);
        }
        ab5 ab5Var = c0211l0 != null ? c0211l0.f6561a : null;
        if (ab5Var == null) {
            ((vx3) ((sg0) z01.m2787a()).f11302H.get()).m2570a("AdActivityMissingDelegate", new Exception("AdActivityMissingDelegate"));
            AbstractC0137h.m1108a("No AdActivityDelegate associated with key", (Throwable) null);
            finish();
            return;
        }
        this.f16261v = ab5Var;
        requestWindowFeature(1);
        try {
            getWindow().getDecorView();
            ab5Var.mo179a(this);
        } catch (Exception e) {
            x45.f33989a.getClass();
            ((vx3) ((sg0) z01.m2787a()).f11302H.get()).m2570a("AdActivityDecorViewWorkaround", e);
            AbstractC0137h.m1108a("Failed to get DecorView", e);
            sy3.m2303a((zo0) ((sg0) z01.m2787a()).f11524u.get(), (t82) null, new wp4(ab5Var, wm0Var, (byte) 3), 3);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        ab5 ab5Var = this.f16261v;
        if (ab5Var != null) {
            ab5Var.onDestroy();
        }
        this.f16261v = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        ab5 ab5Var = this.f16261v;
        if (ab5Var != null) {
            ab5Var.onPause();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        ab5 ab5Var = this.f16261v;
        if (ab5Var != null) {
            ab5Var.mo178a();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        ab5 ab5Var = this.f16261v;
        if (ab5Var != null) {
            ab5Var.onResume();
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        ab5 ab5Var = this.f16261v;
        if (ab5Var != null) {
            ab5Var.mo180b();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        ab5 ab5Var = this.f16261v;
        if (ab5Var != null) {
            ab5Var.onStop();
        }
        super.onStop();
    }

    @Override // p000.ag0, android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        ab5 ab5Var = this.f16261v;
        if (ab5Var != null) {
            ab5Var.mo181c();
        }
    }

    @Override // p000.ag0, android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        ab5 ab5Var = this.f16261v;
        if (ab5Var != null) {
            ab5Var.mo182e();
        }
    }

    @Override // p000.ag0, android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        ab5 ab5Var = this.f16261v;
        if (ab5Var != null) {
            ab5Var.mo182e();
        }
    }

    @Override // p000.ag0, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        ab5 ab5Var = this.f16261v;
        if (ab5Var != null) {
            ab5Var.mo182e();
        }
    }
}
