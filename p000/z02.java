package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.lang.invoke.VarHandle;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class z02 {

    /* JADX INFO: renamed from: a */
    public final Context f35667a;

    /* JADX INFO: renamed from: b */
    public nw0 f35668b = AbstractC0632f.f18620a;

    /* JADX INFO: renamed from: c */
    public ig0 f35669c = null;

    /* JADX INFO: renamed from: d */
    public final js1 f35670d;

    public z02(Context context) {
        this.f35667a = context.getApplicationContext();
        ic1 ic1Var = ic1.f21255a;
        js1 js1Var = new js1();
        js1Var.f22555a = ic1Var;
        VarHandle.storeStoreFence();
        this.f35670d = js1Var;
    }

    /* JADX INFO: renamed from: a */
    public final lk3 m13285a() {
        nw0 nw0Var = this.f35668b;
        byte b = 0;
        y02 y02Var = new y02(b);
        y02Var.f34760b = this;
        VarHandle.storeStoreFence();
        dg4 dg4Var = new dg4(y02Var);
        byte b2 = 1;
        y02 y02Var2 = new y02(b2);
        y02Var2.f34760b = this;
        VarHandle.storeStoreFence();
        dg4 dg4Var2 = new dg4(y02Var2);
        dg4 dg4Var3 = new dg4(new fj0((byte) 21));
        ig0 ig0Var = this.f35669c;
        if (ig0Var == null) {
            v71 v71Var = v71.f32439a;
            ig0Var = new ig0(v71Var, v71Var, v71Var, v71Var, v71Var);
        }
        lk3 lk3Var = new lk3();
        lk3Var.f24103a = this.f35667a;
        lk3Var.f24104b = nw0Var;
        lk3Var.f24105c = dg4Var;
        js1 js1Var = this.f35670d;
        lk3Var.f24106d = js1Var;
        pe4 pe4VarM5675m = AbstractC0647fd.m5675m();
        pw0 pw0Var = l01.f23664a;
        zp0.m13670b(qs5.m10089N(pe4VarM5675m, mp2.f25111a.f35531e).plus(new hm1(lk3Var)));
        fg4 fg4Var = new fg4();
        fg4Var.f18964a = new WeakReference(lk3Var);
        fg4Var.f18968e = true;
        VarHandle.storeStoreFence();
        z32 z32Var = new z32((byte) 29);
        z32Var.f35738b = fg4Var;
        z32Var.f35739c = new h50((byte) 11);
        VarHandle.storeStoreFence();
        lk3Var.f24107e = z32Var;
        C1122rv c1122rv = new C1122rv((byte) 1, false);
        c1122rv.f29651b = new ArrayList(ig0Var.f21357a);
        c1122rv.f29652c = new ArrayList(ig0Var.f21358b);
        c1122rv.f29653d = new ArrayList(ig0Var.f21359c);
        c1122rv.f29654e = new ArrayList(ig0Var.f21360d);
        c1122rv.f29655f = new ArrayList(ig0Var.f21361e);
        VarHandle.storeStoreFence();
        ArrayList arrayList = (ArrayList) c1122rv.f29653d;
        c1122rv.m10445d(new y40((byte) 2), dz1.class);
        byte b3 = 5;
        c1122rv.m10445d(new y40(b3), String.class);
        c1122rv.m10445d(new y40(b2), Uri.class);
        byte b4 = 4;
        c1122rv.m10445d(new y40(b4), Uri.class);
        byte b5 = 3;
        c1122rv.m10445d(new y40(b5), Integer.class);
        c1122rv.m10445d(new y40(b), byte[].class);
        arrayList.add(new l73(new ve1(b2), Uri.class));
        js1Var.getClass();
        ve1 ve1Var = new ve1(b);
        VarHandle.storeStoreFence();
        arrayList.add(new l73(ve1Var, File.class));
        yy1 yy1Var = new yy1();
        yy1Var.f35614a = dg4Var3;
        yy1Var.f35615b = dg4Var2;
        VarHandle.storeStoreFence();
        c1122rv.m10446e(yy1Var, Uri.class);
        c1122rv.m10446e(new C1226uo(b3), File.class);
        c1122rv.m10446e(new C1226uo(b), Uri.class);
        c1122rv.m10446e(new C1226uo(b5), Uri.class);
        c1122rv.m10446e(new C1226uo((byte) 6), Uri.class);
        c1122rv.m10446e(new C1226uo(b4), Drawable.class);
        c1122rv.m10446e(new C1226uo((byte) 1), Bitmap.class);
        c1122rv.m10446e(new C1226uo((byte) 2), ByteBuffer.class);
        ic1 ic1Var = (ic1) js1Var.f22555a;
        h00 h00Var = new h00();
        h00Var.f20240a = ic1Var;
        int i = w14.f33029a;
        h00Var.f20241b = new v14(4, 0);
        VarHandle.storeStoreFence();
        ((ArrayList) c1122rv.f29655f).add(h00Var);
        ig0 ig0VarM10449h = c1122rv.m10449h();
        lk3Var.f24108f = ig0VarM10449h;
        List list = ig0VarM10449h.f21357a;
        v81 v81Var = new v81();
        v81Var.f32457a = lk3Var;
        v81Var.f32458b = fg4Var;
        v81Var.f32459c = z32Var;
        js1 js1Var2 = new js1();
        js1Var2.f22555a = lk3Var;
        VarHandle.storeStoreFence();
        v81Var.f32460d = js1Var2;
        VarHandle.storeStoreFence();
        lk3Var.f24109g = hb0.m6311W0(list, v81Var);
        new AtomicBoolean(false);
        VarHandle.storeStoreFence();
        return lk3Var;
    }
}
