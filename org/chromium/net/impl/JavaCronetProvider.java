package org.chromium.net.impl;

import android.content.Context;
import java.util.Arrays;
import java.util.Collections;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
import p000.iw5;
import p000.nr0;
import p000.tn5;
import p000.tw5;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class JavaCronetProvider extends CronetProvider {
    public JavaCronetProvider(Context context) {
        super(context);
    }

    @Override // org.chromium.net.CronetProvider
    public final CronetEngine.Builder createBuilder() {
        tn5 tn5Var;
        boolean zM9250a = HttpEngineNativeProvider.m9250a();
        nr0 nr0Var = nr0.CRONET_SOURCE_FALLBACK;
        return (zM9250a && (tn5Var = (tn5) Collections.unmodifiableMap(iw5.m6959b(this.mContext, nr0Var).f35372a).get("Cronet_ForceHttpEngineInFallback")) != null && tn5Var.m11072c()) ? new HttpEngineNativeProvider(this.mContext).createBuilder() : new ExperimentalCronetEngine.Builder(new tw5(this.mContext, nr0Var));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof JavaCronetProvider) && this.mContext.equals(((JavaCronetProvider) obj).mContext);
        }
        return true;
    }

    @Override // org.chromium.net.CronetProvider
    public final String getName() {
        return CronetProvider.PROVIDER_NAME_FALLBACK;
    }

    @Override // org.chromium.net.CronetProvider
    public final String getVersion() {
        return ImplVersion.getCronetVersion();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{JavaCronetProvider.class, this.mContext});
    }

    @Override // org.chromium.net.CronetProvider
    public final boolean isEnabled() {
        return true;
    }
}
