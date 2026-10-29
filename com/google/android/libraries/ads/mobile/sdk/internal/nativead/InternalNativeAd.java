package com.google.android.libraries.ads.mobile.sdk.internal.nativead;

import ads_mobile_sdk.C0213l2;
import ads_mobile_sdk.C0367uz;
import ads_mobile_sdk.C0413y3;
import ads_mobile_sdk.cn0;
import ads_mobile_sdk.ey0;
import ads_mobile_sdk.fy3;
import ads_mobile_sdk.h32;
import ads_mobile_sdk.hk1;
import ads_mobile_sdk.i62;
import ads_mobile_sdk.nc3;
import ads_mobile_sdk.pz2;
import ads_mobile_sdk.q62;
import ads_mobile_sdk.ql0;
import ads_mobile_sdk.qp2;
import ads_mobile_sdk.tq2;
import ads_mobile_sdk.yv0;
import com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext;
import java.util.Optional;
import p000.AbstractC1384yx;
import p000.ap0;
import p000.ju4;
import p000.wa2;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class InternalNativeAd extends hk1 {

    /* JADX INFO: renamed from: a */
    public final h32 f16262a;

    /* JADX INFO: renamed from: e */
    public final yv0 f16263e;
    private final Optional<PerAdNativeJavscriptEngineJsContext> jsEngineContext;

    /* JADX INFO: renamed from: l */
    public final i62 f16264l;
    private PerAdNativeJavscriptEngineJsContext localJsEngineContext;

    /* JADX INFO: renamed from: q */
    public final q62 f16265q;

    /* JADX INFO: renamed from: r */
    public final ey0 f16266r;

    /* JADX INFO: renamed from: s */
    public final ql0 f16267s;

    public InternalNativeAd(String str, C0213l2 c0213l2, C0367uz c0367uz, fy3 fy3Var, Optional optional, C0413y3 c0413y3, cn0 cn0Var, h32 h32Var, yv0 yv0Var, i62 i62Var, q62 q62Var, Optional optional2, qp2 qp2Var, nc3 nc3Var, tq2 tq2Var, ey0 ey0Var, AbstractC1384yx abstractC1384yx, ql0 ql0Var) {
        super(str, c0213l2, c0367uz, fy3Var, c0413y3, cn0Var, qp2Var, nc3Var, tq2Var, abstractC1384yx);
        this.f16262a = h32Var;
        this.f16263e = yv0Var;
        this.f16264l = i62Var;
        this.f16265q = q62Var;
        this.jsEngineContext = optional2;
        this.f16266r = ey0Var;
        this.f16267s = ql0Var;
        this.localJsEngineContext = (PerAdNativeJavscriptEngineJsContext) optional2.orElse(null);
    }

    @Override // ads_mobile_sdk.hk1, p000.r75
    /* JADX INFO: renamed from: a */
    public final Object mo1157a(pz2 pz2Var) {
        this.localJsEngineContext = this.jsEngineContext.orElse(null);
        Object objM1155a = hk1.m1155a(this, pz2Var);
        return objM1155a == ap0.f14763a ? objM1155a : ju4.f22634a;
    }

    @Override // ads_mobile_sdk.hk1
    public final void destroy() {
        super.destroy();
        this.f16263e.getClass();
    }

    @Override // ads_mobile_sdk.hk1, p000.r75
    /* JADX INFO: renamed from: g */
    public final wa2 mo1162g() {
        return this.f16262a.f4279w;
    }
}
