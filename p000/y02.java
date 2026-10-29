package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import java.lang.invoke.VarHandle;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y02 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f34759a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ z02 f34760b;

    public /* synthetic */ y02(byte b) {
        this.f34759a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        int i;
        qd4 qd4Var;
        int largeMemoryClass;
        jk3 jk3VarM13892a;
        byte b = this.f34759a;
        z02 z02Var = this.f34760b;
        switch (b) {
            case 0:
                Context context = z02Var.f35667a;
                Bitmap.Config[] configArr = AbstractC0707h.f20231a;
                double d = 0.2d;
                try {
                    if (((ActivityManager) context.getSystemService(ActivityManager.class)).isLowRamDevice()) {
                        d = 0.15d;
                    }
                } catch (Exception unused) {
                }
                hf0 hf0Var = new hf0((byte) 6);
                hf0Var.f20529c = new LinkedHashMap();
                VarHandle.storeStoreFence();
                if (d > 0.0d) {
                    Bitmap.Config[] configArr2 = AbstractC0707h.f20231a;
                    try {
                        ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityManager.class);
                        largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                    } catch (Exception unused2) {
                        largeMemoryClass = 256;
                    }
                    i = (int) (d * ((double) largeMemoryClass) * 1024.0d * 1024.0d);
                    break;
                } else {
                    i = 0;
                }
                if (i > 0) {
                    z32 z32Var = new z32((byte) 28);
                    z32Var.f35738b = hf0Var;
                    z32Var.f35739c = new uk3(i, z32Var);
                    VarHandle.storeStoreFence();
                    qd4Var = z32Var;
                } else {
                    js1 js1Var = new js1();
                    js1Var.f22555a = hf0Var;
                    VarHandle.storeStoreFence();
                    qd4Var = js1Var;
                }
                pk3 pk3Var = new pk3();
                pk3Var.f27690a = qd4Var;
                pk3Var.f27691b = hf0Var;
                VarHandle.storeStoreFence();
                return pk3Var;
            default:
                o85 o85Var = o85.f26456p;
                Context context2 = z02Var.f35667a;
                synchronized (o85Var) {
                    try {
                        jk3VarM13892a = o85.f26457q;
                        if (jk3VarM13892a == null) {
                            zz0 zz0Var = new zz0();
                            zz0Var.f36496b = jf1.f22209a;
                            zz0Var.f36497c = 0.02d;
                            zz0Var.f36498d = 10485760;
                            zz0Var.f36499e = 262144000;
                            pw0 pw0Var = l01.f23664a;
                            zz0Var.f36500f = gw0.f20149b;
                            Bitmap.Config[] configArr3 = AbstractC0707h.f20231a;
                            File cacheDir = context2.getCacheDir();
                            if (cacheDir == null) {
                                throw new IllegalStateException("cacheDir == null");
                            }
                            cacheDir.mkdirs();
                            File fileM11046Q0 = tf1.m11046Q0(cacheDir, "image_cache");
                            String str = p83.f27431b;
                            zz0Var.f36495a = h50.m6220A(fileM11046Q0);
                            jk3VarM13892a = zz0Var.m13892a();
                            o85.f26457q = jk3VarM13892a;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return jk3VarM13892a;
        }
    }
}
