package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.lang.invoke.VarHandle;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: uo */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1226uo implements ne1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f32019a;

    public /* synthetic */ C1226uo(byte b) {
        this.f32019a = b;
    }

    @Override // p000.ne1
    /* JADX INFO: renamed from: a */
    public final oe1 mo5198a(Object obj, b63 b63Var) {
        switch (this.f32019a) {
            case 0:
                Uri uri = (Uri) obj;
                if (!AbstractC0707h.m6200c(uri)) {
                    return null;
                }
                C1263vo c1263vo = new C1263vo((byte) 0);
                c1263vo.f32757b = uri;
                c1263vo.f32758c = b63Var;
                VarHandle.storeStoreFence();
                return c1263vo;
            case 1:
                k00 k00Var = new k00((byte) 0);
                k00Var.f22788c = (Bitmap) obj;
                k00Var.f22787b = b63Var;
                VarHandle.storeStoreFence();
                return k00Var;
            case 2:
                k00 k00Var2 = new k00((byte) 1);
                k00Var2.f22788c = (ByteBuffer) obj;
                k00Var2.f22787b = b63Var;
                VarHandle.storeStoreFence();
                return k00Var2;
            case 3:
                Uri uri2 = (Uri) obj;
                if (!z62.m13387o(uri2.getScheme(), "content")) {
                    return null;
                }
                C1263vo c1263vo2 = new C1263vo((byte) 1);
                c1263vo2.f32757b = uri2;
                c1263vo2.f32758c = b63Var;
                VarHandle.storeStoreFence();
                return c1263vo2;
            case 4:
                k00 k00Var3 = new k00((byte) 2);
                k00Var3.f22788c = (Drawable) obj;
                k00Var3.f22787b = b63Var;
                VarHandle.storeStoreFence();
                return k00Var3;
            case 5:
                te1 te1Var = new te1();
                te1Var.f31096a = (File) obj;
                VarHandle.storeStoreFence();
                return te1Var;
            default:
                Uri uri3 = (Uri) obj;
                if (!z62.m13387o(uri3.getScheme(), "android.resource")) {
                    return null;
                }
                C1263vo c1263vo3 = new C1263vo((byte) 2);
                c1263vo3.f32757b = uri3;
                c1263vo3.f32758c = b63Var;
                VarHandle.storeStoreFence();
                return c1263vo3;
        }
    }
}
