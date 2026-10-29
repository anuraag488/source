package p000;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import essentials.app.EsActivityTransparent;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xz4 {

    /* JADX INFO: renamed from: a */
    public Application f34746a;

    /* JADX INFO: renamed from: b */
    public xn2 f34747b;

    /* JADX INFO: renamed from: c */
    public d83 f34748c;

    /* JADX INFO: renamed from: d */
    public wy0 f34749d;

    /* JADX INFO: renamed from: e */
    public w94 f34750e;

    /* JADX INFO: renamed from: f */
    public int f34751f;

    /* JADX INFO: renamed from: a */
    public final ag0 m12798a() {
        return (ag0) this.f34748c.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final Object m12799b(pg0 pg0Var, ym0 ym0Var) {
        int iIntValue;
        Application application = this.f34746a;
        xn2 xn2Var = this.f34747b;
        b70 b70Var = new b70(1, C0006a5.m86x(ym0Var));
        b70Var.m3497u();
        Integer num = (Integer) this.f34749d.getValue();
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = this.f34751f;
            this.f34751f = iIntValue + 1;
        }
        wz4 wz4Var = new wz4(iIntValue, pg0Var, b70Var);
        if (xn2Var != null) {
            String strM12721a = xn2Var.m12721a();
            k44 k44Var = k44.f22883b;
            if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                xn2Var.m12722b(k44Var, strM12721a, "show " + wz4Var + " (host = " + iIntValue + ", current = " + (num != null) + ")", null);
            }
        }
        C0686gf c0686gf = new C0686gf((byte) 15);
        c0686gf.f19762b = this;
        c0686gf.f19763c = wz4Var;
        VarHandle.storeStoreFence();
        b70Var.m3499w(c0686gf);
        this.f34750e.add(wz4Var);
        if (num == null) {
            if (xn2Var != null) {
                String strM12721a2 = xn2Var.m12721a();
                k44 k44Var2 = k44.f22883b;
                if (xn2Var.f34459a.m8274a().compareTo(k44Var2) <= 0) {
                    xn2Var.m12722b(k44Var2, strM12721a2, c75.m3877i(iIntValue, "launch "), null);
                }
            }
            application.startActivity(new Intent(application, (Class<?>) EsActivityTransparent.class).setData(Uri.parse("essentials://windows/" + iIntValue)).addFlags(268435456).addFlags(8388608).addFlags(65536).putExtra("host_id", iIntValue));
        }
        Object objM3495r = b70Var.m3495r();
        ap0 ap0Var = ap0.f14763a;
        return objM3495r;
    }
}
