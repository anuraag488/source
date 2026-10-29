package org.chromium.net.impl;

import android.content.Context;
import android.net.http.HttpEngine;
import java.util.Arrays;
import java.util.Collections;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
import p000.iw5;
import p000.nr0;
import p000.r16;
import p000.tn5;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class NativeCronetProvider extends CronetProvider {

    /* JADX INFO: renamed from: a */
    public final HttpEngineNativeProvider f27039a;

    public NativeCronetProvider(Context context) {
        super(context);
        this.f27039a = new HttpEngineNativeProvider(this.mContext);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m9251a() {
        tn5 tn5Var;
        return HttpEngineNativeProvider.m9250a() && (tn5Var = (tn5) Collections.unmodifiableMap(iw5.m6959b(this.mContext, nr0.CRONET_SOURCE_STATICALLY_LINKED).f35372a).get("Cronet_OverrideNativeCronetWithHttpEngine")) != null && tn5Var.m11072c();
    }

    @Override // org.chromium.net.CronetProvider
    public final CronetEngine.Builder createBuilder() {
        return m9251a() ? this.f27039a.createBuilder() : new ExperimentalCronetEngine.Builder(new r16(this.mContext, r16.f28959t));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof NativeCronetProvider) && this.mContext.equals(((NativeCronetProvider) obj).mContext);
        }
        return true;
    }

    @Override // org.chromium.net.CronetProvider
    public final String getName() {
        return CronetProvider.PROVIDER_NAME_APP_PACKAGED;
    }

    @Override // org.chromium.net.CronetProvider
    public final String getVersion() {
        if (!m9251a()) {
            return ImplVersion.getCronetVersion();
        }
        this.f27039a.getClass();
        return HttpEngine.getVersionString();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{NativeCronetProvider.class, this.mContext});
    }

    @Override // org.chromium.net.CronetProvider
    public final boolean isEnabled() {
        try {
            Class.forName(getClass().getName().concat("Sentinel"), false, getClass().getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
