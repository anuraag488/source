package com.google.android.gms.net;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;
import p000.e51;
import p000.rr0;
import p000.wt1;
import p000.xt1;
import p000.xy4;
import p000.y42;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class PlayServicesCronetProvider extends CronetProvider {
    private static final String NATIVE_CRONET_ENGINE_BUILDER_IMPL = "org.chromium.net.impl.NativeCronetEngineBuilderImpl";
    private static final String TAG = "PlayServicesCronet";

    public PlayServicesCronetProvider(Context context) {
        super(context);
    }

    private void tryToInstallCronetProvider() {
        try {
            rr0.m10414a(this.mContext);
        } catch (wt1 unused) {
            if (Log.isLoggable(TAG, 4)) {
                Log.i(TAG, "Google-Play-Services-Cronet-Provider is unavailable.");
            }
        } catch (xt1 unused2) {
            if (Log.isLoggable(TAG, 4)) {
                Log.i(TAG, "Google-Play-Services-Cronet-Provider is not installed yet.");
            }
        }
    }

    @Override // org.chromium.net.CronetProvider
    public CronetEngine.Builder createBuilder() {
        ExperimentalCronetEngine.Builder builder;
        e51 e51Var;
        try {
            rr0.m10414a(this.mContext);
            try {
                synchronized (rr0.f29545b) {
                    e51Var = rr0.f29546c;
                }
                y42.m12854a0(e51Var);
                ClassLoader classLoader = e51Var.f17706a.getClassLoader();
                y42.m12854a0(classLoader);
                builder = new ExperimentalCronetEngine.Builder((ICronetEngineBuilder) classLoader.loadClass(NATIVE_CRONET_ENGINE_BUILDER_IMPL).asSubclass(ICronetEngineBuilder.class).getConstructor(Context.class).newInstance(this.mContext));
                e = null;
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                e = e;
                builder = null;
            }
            if (e == null) {
                y42.m12855b0(builder, "The value of the constructed builder should never be null");
                return builder;
            }
            xy4.m12785n("Unable to construct the implementation of the Cronet Engine Builder: org.chromium.net.impl.NativeCronetEngineBuilderImpl", e);
            return null;
        } catch (wt1 e2) {
            throw new IllegalStateException("Google Play Services Cronet provider is unavailable on this device.", e2);
        } catch (xt1 e3) {
            throw new IllegalStateException("Google Play Services Cronet provider is not enabled. Call com.google.android.gms.net.CronetProviderInstaller.installIfNeeded(Context) to enable it.", e3);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof PlayServicesCronetProvider) && this.mContext.equals(((PlayServicesCronetProvider) obj).mContext);
        }
        return true;
    }

    @Override // org.chromium.net.CronetProvider
    public String getName() {
        return "Google-Play-Services-Cronet-Provider";
    }

    @Override // org.chromium.net.CronetProvider
    public String getVersion() {
        String str;
        tryToInstallCronetProvider();
        synchronized (rr0.f29545b) {
            str = rr0.f29547d;
        }
        return str;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{PlayServicesCronetProvider.class, this.mContext});
    }

    @Override // org.chromium.net.CronetProvider
    public boolean isEnabled() {
        e51 e51Var;
        tryToInstallCronetProvider();
        synchronized (rr0.f29545b) {
            e51Var = rr0.f29546c;
        }
        return e51Var != null;
    }
}
