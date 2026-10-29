package p000;

import android.os.StatFs;
import java.io.File;
import java.lang.invoke.VarHandle;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zz0 {

    /* JADX INFO: renamed from: a */
    public p83 f36495a;

    /* JADX INFO: renamed from: b */
    public zb2 f36496b;

    /* JADX INFO: renamed from: c */
    public double f36497c;

    /* JADX INFO: renamed from: d */
    public int f36498d;

    /* JADX INFO: renamed from: e */
    public int f36499e;

    /* JADX INFO: renamed from: f */
    public gw0 f36500f;

    /* JADX INFO: renamed from: a */
    public final jk3 m13892a() {
        long jM10676q;
        int i = this.f36498d;
        double d = this.f36497c;
        p83 p83Var = this.f36495a;
        if (p83Var == null) {
            C1077qn.m9989o("directory == null");
            return null;
        }
        if (d > 0.0d) {
            try {
                File file = p83Var.toFile();
                file.mkdir();
                StatFs statFs = new StatFs(file.getAbsolutePath());
                jM10676q = sc6.m10676q((long) (d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), i, this.f36499e);
            } catch (Exception unused) {
                jM10676q = i;
            }
        } else {
            jM10676q = 0;
        }
        zb2 zb2Var = this.f36496b;
        gw0 gw0Var = this.f36500f;
        jk3 jk3Var = new jk3();
        jk3Var.f22348a = zb2Var;
        d01 d01Var = new d01();
        d01Var.f16664a = p83Var;
        d01Var.f16665b = jM10676q;
        if (jM10676q <= 0) {
            C1077qn.m9987m("maxSize <= 0");
            return null;
        }
        d01Var.f16666c = p83Var.m9386d("journal");
        d01Var.f16667d = p83Var.m9386d("journal.tmp");
        d01Var.f16668e = p83Var.m9386d("journal.bkp");
        d01Var.f16669f = new LinkedHashMap(0, 0.75f, true);
        pe4 pe4VarM5675m = AbstractC0647fd.m5675m();
        gw0Var.getClass();
        d01Var.f16670g = zp0.m13670b(qs5.m10089N(pe4VarM5675m, qu4.f28819b.mo5042N(1, null)));
        c01 c01Var = new c01();
        c01Var.f15731b = zb2Var;
        VarHandle.storeStoreFence();
        d01Var.f16679p = c01Var;
        VarHandle.storeStoreFence();
        jk3Var.f22349b = d01Var;
        VarHandle.storeStoreFence();
        return jk3Var;
    }
}
