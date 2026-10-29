package org.chromium.net.impl;

import android.content.Context;
import android.net.http.HttpEngine;
import android.os.Trace;
import android.os.ext.SdkExtensions;
import java.lang.invoke.VarHandle;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
import p000.bv1;
import p000.ry5;
import p000.y06;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class HttpEngineNativeProvider extends CronetProvider {
    public HttpEngineNativeProvider(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m9250a() {
        return SdkExtensions.getExtensionVersion(31) >= 7;
    }

    @Override // org.chromium.net.CronetProvider
    public final CronetEngine.Builder createBuilder() {
        ry5.m10503a("HttpEngineNativeProvider#createBuilder");
        try {
            Context context = this.mContext;
            bv1.m3719u();
            HttpEngine.Builder builderM3709k = bv1.m3709k(this.mContext);
            y06 y06Var = new y06();
            y06Var.f34799b = context;
            y06Var.f34800c = builderM3709k;
            VarHandle.storeStoreFence();
            ExperimentalCronetEngine.Builder builder = new ExperimentalCronetEngine.Builder(y06Var);
            Trace.endSection();
            return builder;
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // org.chromium.net.CronetProvider
    public final String getName() {
        return CronetProvider.PROVIDER_NAME_HTTPENGINE_NATIVE;
    }

    @Override // org.chromium.net.CronetProvider
    public final String getVersion() {
        return HttpEngine.getVersionString();
    }

    @Override // org.chromium.net.CronetProvider
    public final boolean isEnabled() {
        return m9250a();
    }
}
