package p000;

import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vf4 extends mt2 implements pc3, ky0, oc3 {

    /* JADX INFO: renamed from: o */
    public Object f32569o;

    /* JADX INFO: renamed from: p */
    public Object f32570p;

    /* JADX INFO: renamed from: q */
    public PointerInputEventHandler f32571q;

    /* JADX INFO: renamed from: r */
    public t82 f32572r;

    /* JADX INFO: renamed from: s */
    public ec3 f32573s = rf4.f29227a;

    /* JADX INFO: renamed from: t */
    public final uw2 f32574t;

    /* JADX INFO: renamed from: u */
    public final uw2 f32575u;

    /* JADX INFO: renamed from: v */
    public final uw2 f32576v;

    /* JADX INFO: renamed from: w */
    public ec3 f32577w;

    /* JADX INFO: renamed from: x */
    public long f32578x;

    public vf4(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.f32569o = obj;
        this.f32570p = obj2;
        this.f32571q = pointerInputEventHandler;
        uw2 uw2Var = new uw2(new uf4[16]);
        this.f32574t = uw2Var;
        this.f32575u = uw2Var;
        this.f32576v = new uw2(new uf4[16]);
        this.f32578x = 0L;
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: H0 */
    public final void mo27H0() {
        m11891Q0();
    }

    @Override // p000.oc3
    /* JADX INFO: renamed from: N */
    public final void mo6964N(ec3 ec3Var, fc3 fc3Var, long j) {
        this.f32578x = j;
        if (fc3Var == fc3.f18903a) {
            this.f32573s = ec3Var;
        }
        wm0 wm0Var = null;
        if (this.f32572r == null) {
            this.f32572r = lb5.m7910S(m8391C0(), null, cp0.f16328d, new C0784j3(this, wm0Var, (byte) 5), 1);
        }
        m11890P0(ec3Var, fc3Var);
        List list = ec3Var.f18000a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!AbstractC1356y5.m12923q((lc3) list.get(i))) {
                this.f32577w = ec3Var;
            }
        }
        ec3Var = null;
        this.f32577w = ec3Var;
    }

    /* JADX INFO: renamed from: O0 */
    public final Object m11889O0(mq1 mq1Var, wm0 wm0Var) {
        b70 b70Var = new b70(1, C0006a5.m86x(wm0Var));
        b70Var.m3497u();
        uf4 uf4Var = new uf4();
        uf4Var.f31830f = this;
        uf4Var.f31825a = this;
        uf4Var.f31826b = b70Var;
        uf4Var.f31828d = fc3.f18904b;
        uf4Var.f31829e = r71.f29063a;
        VarHandle.storeStoreFence();
        synchronized (this.f32575u) {
            this.f32574t.m11663b(uf4Var);
            wm0 wm0VarM86x = C0006a5.m86x(C0006a5.m74l(uf4Var, uf4Var, mq1Var));
            ap0 ap0Var = ap0.f14763a;
            new ut3(wm0VarM86x).resumeWith(ju4.f22634a);
        }
        C1143sf c1143sf = new C1143sf((byte) 5);
        c1143sf.f30223b = uf4Var;
        VarHandle.storeStoreFence();
        b70Var.m3499w(c1143sf);
        return b70Var.m3495r();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004c A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:6:0x000d, B:13:0x001b, B:14:0x0020, B:17:0x0023, B:20:0x002f, B:22:0x0037, B:24:0x003b, B:25:0x0040, B:26:0x0043, B:28:0x004c, B:30:0x0054, B:32:0x0058), top: B:41:0x000d }] */
    /* JADX INFO: renamed from: P0 */
    public final void m11890P0(ec3 ec3Var, fc3 fc3Var) {
        Object[] objArr;
        int i;
        int i2;
        uf4 uf4Var;
        b70 b70Var;
        b70 b70Var2;
        synchronized (this.f32575u) {
            uw2 uw2Var = this.f32576v;
            uw2Var.m11664c(uw2Var.f32213c, this.f32574t);
        }
        try {
            int iOrdinal = fc3Var.ordinal();
            if (iOrdinal == 0) {
                uw2 uw2Var2 = this.f32576v;
                objArr = uw2Var2.f32211a;
                i = uw2Var2.f32213c;
                for (i2 = 0; i2 < i; i2++) {
                    uf4Var = (uf4) objArr[i2];
                    if (fc3Var != uf4Var.f31828d && (b70Var = uf4Var.f31827c) != null) {
                        uf4Var.f31827c = null;
                        b70Var.resumeWith(ec3Var);
                    }
                }
            } else if (iOrdinal == 1) {
                uw2 uw2Var3 = this.f32576v;
                int i3 = uw2Var3.f32213c - 1;
                Object[] objArr2 = uw2Var3.f32211a;
                if (i3 < objArr2.length) {
                    while (i3 >= 0) {
                        uf4 uf4Var2 = (uf4) objArr2[i3];
                        if (fc3Var == uf4Var2.f31828d && (b70Var2 = uf4Var2.f31827c) != null) {
                            uf4Var2.f31827c = null;
                            b70Var2.resumeWith(ec3Var);
                        }
                        i3--;
                    }
                }
            } else {
                if (iOrdinal != 2) {
                    throw new gf0();
                }
                uw2 uw2Var4 = this.f32576v;
                objArr = uw2Var4.f32211a;
                i = uw2Var4.f32213c;
                while (i2 < i) {
                    uf4Var = (uf4) objArr[i2];
                    if (fc3Var != uf4Var.f31828d) {
                    }
                }
            }
            this.f32576v.m11668g();
        } catch (Throwable th) {
            this.f32576v.m11668g();
            throw th;
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m11891Q0() {
        t82 t82Var = this.f32572r;
        if (t82Var != null) {
            t82Var.mo4993a(new rt2("Pointer input was reset", (byte) 2));
            this.f32572r = null;
        }
    }

    @Override // p000.px0
    /* JADX INFO: renamed from: a */
    public final void mo4197a() {
        m11891Q0();
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: c */
    public final float mo3580c() {
        return sc6.m10652X(this).f33336z.mo3580c();
    }

    @Override // p000.oc3
    /* JADX INFO: renamed from: e0 */
    public final void mo9035e0() {
        m11891Q0();
    }

    @Override // p000.oc3
    /* JADX INFO: renamed from: j0 */
    public final void mo8143j0() {
        ec3 ec3Var = this.f32577w;
        if (ec3Var == null) {
            return;
        }
        List list = ec3Var.f18000a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((lc3) list.get(i)).f23938d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    lc3 lc3Var = (lc3) list.get(i2);
                    long j = lc3Var.f23935a;
                    long j2 = lc3Var.f23937c;
                    long j3 = lc3Var.f23936b;
                    float f = lc3Var.f23939e;
                    boolean z = lc3Var.f23938d;
                    arrayList.add(new lc3(j, j3, j2, false, f, j3, j2, z, z, lc3Var.f23943i, 0L, 1.0f, 0L));
                }
                ec3 ec3Var2 = new ec3(arrayList, null);
                this.f32573s = ec3Var2;
                m11890P0(ec3Var2, fc3.f18903a);
                m11890P0(ec3Var2, fc3.f18904b);
                m11890P0(ec3Var2, fc3.f18905c);
                this.f32577w = null;
                return;
            }
        }
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: r */
    public final float mo3585r() {
        return sc6.m10652X(this).f33336z.mo3585r();
    }
}
