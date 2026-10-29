package com.google.android.libraries.ads.mobile.sdk.internal.webview;

import ads_mobile_sdk.C0379vn;
import ads_mobile_sdk.s41;
import ads_mobile_sdk.u41;
import ads_mobile_sdk.x31;
import ads_mobile_sdk.zl2;
import android.net.Uri;
import java.util.LinkedHashSet;
import java.util.Set;
import p000.C1077qn;
import p000.ap0;
import p000.cf0;
import p000.gx2;
import p000.hd4;
import p000.jg5;
import p000.ju4;
import p000.k43;
import p000.nh5;
import p000.ym0;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class PerAdNativeJavscriptEngineJsContext implements nh5 {

    /* JADX INFO: renamed from: a */
    public final nh5 f16269a;

    /* JADX INFO: renamed from: b */
    public final String f16270b;

    /* JADX INFO: renamed from: c */
    public final gx2 f16271c = new gx2(false);
    private final Set<jg5> perAdGmsgHandlers = new LinkedHashSet();

    public PerAdNativeJavscriptEngineJsContext(nh5 nh5Var, String str) {
        this.f16269a = nh5Var;
        this.f16270b = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c5, code lost:
    
        if (r8.mo1080a(r9, r10, r0) == r1) goto L49;
     */
    @Override // p000.nh5
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1080a(String str, jg5 jg5Var, ym0 ym0Var) {
        zl2 zl2Var;
        PerAdNativeJavscriptEngineJsContext perAdNativeJavscriptEngineJsContext;
        gx2 gx2Var;
        gx2 gx2Var2;
        if (ym0Var instanceof zl2) {
            zl2Var = (zl2) ym0Var;
            int i = zl2Var.f14272g;
            if ((i & Integer.MIN_VALUE) != 0) {
                zl2Var.f14272g = i - Integer.MIN_VALUE;
            } else {
                zl2Var = new zl2(this, ym0Var);
            }
        } else {
            zl2Var = new zl2(this, ym0Var);
        }
        Object obj = zl2Var.f14270e;
        ap0 ap0Var = ap0.f14763a;
        int i2 = zl2Var.f14272g;
        if (i2 != 0) {
            if (i2 == 1) {
                gx2Var2 = zl2Var.f14269d;
                jg5Var = zl2Var.f14268c;
                str = zl2Var.f14267b;
                perAdNativeJavscriptEngineJsContext = zl2Var.f14266a;
                k43.m7376J(obj);
                try {
                    perAdNativeJavscriptEngineJsContext.perAdGmsgHandlers.add(jg5Var);
                    gx2Var2.m6193g(null);
                } catch (Throwable th) {
                    gx2Var2.m6193g(null);
                    throw th;
                }
            } else if (i2 == 2) {
                gx2Var = zl2Var.f14269d;
                jg5Var = zl2Var.f14268c;
                str = zl2Var.f14267b;
                perAdNativeJavscriptEngineJsContext = zl2Var.f14266a;
                k43.m7376J(obj);
                try {
                    jg5Var.mo801a(perAdNativeJavscriptEngineJsContext.f16270b);
                    perAdNativeJavscriptEngineJsContext.perAdGmsgHandlers.add(jg5Var);
                    gx2Var.m6193g(null);
                } catch (Throwable th2) {
                    gx2Var.m6193g(null);
                    throw th2;
                }
            } else {
                if (i2 != 3) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
            }
            return ju4.f22634a;
        }
        k43.m7376J(obj);
        String strMo803f = jg5Var.mo803f();
        gx2 gx2Var3 = this.f16271c;
        if (strMo803f == null || hd4.m6345k0(strMo803f)) {
            String str2 = this.f16270b;
            if (str2 == null || hd4.m6345k0(str2)) {
                nh5 nh5Var = this.f16269a;
                zl2Var.f14266a = null;
                zl2Var.f14267b = null;
                zl2Var.f14268c = null;
                zl2Var.f14269d = null;
                zl2Var.f14272g = 3;
            } else {
                zl2Var.f14266a = this;
                zl2Var.f14267b = str;
                zl2Var.f14268c = jg5Var;
                zl2Var.f14269d = gx2Var3;
                zl2Var.f14272g = 2;
                if (gx2Var3.m6191e(zl2Var) != ap0Var) {
                    perAdNativeJavscriptEngineJsContext = this;
                    gx2Var = gx2Var3;
                    jg5Var.mo801a(perAdNativeJavscriptEngineJsContext.f16270b);
                    perAdNativeJavscriptEngineJsContext.perAdGmsgHandlers.add(jg5Var);
                    gx2Var.m6193g(null);
                }
            }
        } else {
            zl2Var.f14266a = this;
            zl2Var.f14267b = str;
            zl2Var.f14268c = jg5Var;
            zl2Var.f14269d = gx2Var3;
            zl2Var.f14272g = 1;
            if (gx2Var3.m6191e(zl2Var) != ap0Var) {
                perAdNativeJavscriptEngineJsContext = this;
                gx2Var2 = gx2Var3;
                perAdNativeJavscriptEngineJsContext.perAdGmsgHandlers.add(jg5Var);
                gx2Var2.m6193g(null);
            }
        }
        return ap0Var;
        this = perAdNativeJavscriptEngineJsContext;
        nh5 nh5Var2 = this.f16269a;
        zl2Var.f14266a = null;
        zl2Var.f14267b = null;
        zl2Var.f14268c = null;
        zl2Var.f14269d = null;
        zl2Var.f14272g = 3;
    }

    @Override // p000.nh5
    /* JADX INFO: renamed from: a */
    public final Object mo1077a(s41 s41Var, String str, C0379vn c0379vn) {
        return this.f16269a.mo1077a(s41Var, str, c0379vn);
    }

    @Override // p000.nh5
    /* JADX INFO: renamed from: a */
    public final Object mo1078a(Uri uri, s41 s41Var, u41 u41Var) {
        return this.f16269a.mo1078a(uri, s41Var, u41Var);
    }

    @Override // p000.nh5
    /* JADX INFO: renamed from: a */
    public final Object mo1079a(String str, cf0 cf0Var, x31 x31Var) {
        return this.f16269a.mo1079a(str, cf0Var, x31Var);
    }
}
