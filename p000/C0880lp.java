package p000;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: lp */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0880lp extends i73 implements pm3 {

    /* JADX INFO: renamed from: t */
    public static final C0499bp f24242t = new C0499bp(0);

    /* JADX INFO: renamed from: f */
    public um0 f24243f;

    /* JADX INFO: renamed from: g */
    public final ac4 f24244g = bc4.m3547a(h74.m6269a(0));

    /* JADX INFO: renamed from: h */
    public final d83 f24245h = k43.m7398w(null);

    /* JADX INFO: renamed from: i */
    public final z73 f24246i = new z73(1.0f);

    /* JADX INFO: renamed from: j */
    public final d83 f24247j = k43.m7398w(null);

    /* JADX INFO: renamed from: k */
    public AbstractC0696gp f24248k;

    /* JADX INFO: renamed from: l */
    public i73 f24249l;

    /* JADX INFO: renamed from: m */
    public yp1 f24250m;

    /* JADX INFO: renamed from: n */
    public yp1 f24251n;

    /* JADX INFO: renamed from: o */
    public jm0 f24252o;

    /* JADX INFO: renamed from: p */
    public boolean f24253p;

    /* JADX INFO: renamed from: q */
    public final d83 f24254q;

    /* JADX INFO: renamed from: r */
    public final d83 f24255r;

    /* JADX INFO: renamed from: s */
    public final d83 f24256s;

    public C0880lp(b12 b12Var, lk3 lk3Var) {
        C0546cp c0546cp = C0546cp.f16324a;
        this.f24248k = c0546cp;
        this.f24250m = f24242t;
        jm0.f22418cp.getClass();
        this.f24252o = im0.f21547b;
        this.f24254q = k43.m7398w(c0546cp);
        this.f24255r = k43.m7398w(b12Var);
        this.f24256s = k43.m7398w(lk3Var);
    }

    @Override // p000.i73
    /* JADX INFO: renamed from: a */
    public final boolean mo35a(float f) {
        this.f24246i.m13400i(f);
        return true;
    }

    @Override // p000.i73
    /* JADX INFO: renamed from: b */
    public final boolean mo36b(o00 o00Var) {
        this.f24247j.setValue(o00Var);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.pm3
    /* JADX INFO: renamed from: c */
    public final void mo37c() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            if (this.f24243f == null) {
                pe4 pe4VarM5675m = AbstractC0647fd.m5675m();
                pw0 pw0Var = l01.f23664a;
                um0 um0VarM13670b = zp0.m13670b(qs5.m10089N(pe4VarM5675m, mp2.f25111a.f35531e));
                this.f24243f = um0VarM13670b;
                i73 i73Var = this.f24249l;
                byte b = 0;
                pm3 pm3Var = i73Var instanceof pm3 ? (pm3) i73Var : null;
                if (pm3Var != null) {
                    pm3Var.mo37c();
                }
                if (this.f24253p) {
                    a12 a12VarM3401a = b12.m3401a((b12) this.f24255r.getValue());
                    a12VarM3401a.f38b = ((lk3) this.f24256s.getValue()).f24104b;
                    a12VarM3401a.f52p = null;
                    Drawable drawable = a12VarM3401a.m16a().f15021z.f26137j;
                    nw0 nw0Var = AbstractC0632f.f18620a;
                    m8068k(new C0620ep(drawable != null ? m8067j(drawable) : null));
                } else {
                    lb5.m7910S(um0VarM13670b, null, null, new C0982og((Object) this, (wm0) (b == true ? 1 : 0), (byte) 2), 3);
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // p000.pm3
    /* JADX INFO: renamed from: d */
    public final void mo38d() {
        um0 um0Var = this.f24243f;
        if (um0Var != null) {
            zp0.m13682n(um0Var, null);
        }
        this.f24243f = null;
        Object obj = this.f24249l;
        pm3 pm3Var = obj instanceof pm3 ? (pm3) obj : null;
        if (pm3Var != null) {
            pm3Var.mo38d();
        }
    }

    @Override // p000.i73
    /* JADX INFO: renamed from: g */
    public final long mo40g() {
        i73 i73Var = (i73) this.f24245h.getValue();
        if (i73Var != null) {
            return i73Var.mo40g();
        }
        return 9205357640488583168L;
    }

    @Override // p000.pm3
    /* JADX INFO: renamed from: h */
    public final void mo41h() {
        um0 um0Var = this.f24243f;
        if (um0Var != null) {
            zp0.m13682n(um0Var, null);
        }
        this.f24243f = null;
        Object obj = this.f24249l;
        pm3 pm3Var = obj instanceof pm3 ? (pm3) obj : null;
        if (pm3Var != null) {
            pm3Var.mo41h();
        }
    }

    @Override // p000.i73
    /* JADX INFO: renamed from: i */
    public final void mo42i(u31 u31Var) {
        this.f24244g.m200k(null, h74.m6269a(u31Var.mo11227d()));
        i73 i73Var = (i73) this.f24245h.getValue();
        if (i73Var != null) {
            i73Var.m6688f(u31Var, u31Var.mo11227d(), this.f24246i.m13399h(), (o00) this.f24247j.getValue());
        }
    }

    /* JADX INFO: renamed from: j */
    public final i73 m8067j(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return z62.m13378f(new C0759ie(((BitmapDrawable) drawable).getBitmap()));
        }
        Drawable drawableMutate = drawable.mutate();
        a41 a41Var = new a41();
        a41Var.f91f = drawableMutate;
        a41Var.f92g = k43.m7398w(0);
        pg2 pg2Var = c41.f15794a;
        a41Var.f93h = k43.m7398w(h74.m6269a((drawableMutate.getIntrinsicWidth() < 0 || drawableMutate.getIntrinsicHeight() < 0) ? 9205357640488583168L : i20.m6583h(drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight())));
        a41Var.f94i = new dg4(new C0948nj(a41Var, (byte) 1));
        if (drawableMutate.getIntrinsicWidth() < 0 || drawableMutate.getIntrinsicHeight() < 0) {
            VarHandle.storeStoreFence();
            return a41Var;
        }
        drawableMutate.setBounds(0, 0, drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight());
        VarHandle.storeStoreFence();
        return a41Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0052  */
    /* JADX WARN: Code duplicated, block: B:18:0x0055  */
    /* JADX WARN: Code duplicated, block: B:21:0x0060  */
    /* JADX WARN: Code duplicated, block: B:23:0x0065  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    public final void m8068k(AbstractC0696gp abstractC0696gp) {
        c12 c12Var;
        yp1 yp1Var;
        Object objMo4634a;
        pm3 pm3Var;
        pm3 pm3Var2;
        AbstractC0696gp abstractC0696gp2 = this.f24248k;
        AbstractC0696gp abstractC0696gp3 = (AbstractC0696gp) this.f24250m.invoke(abstractC0696gp);
        this.f24248k = abstractC0696gp3;
        this.f24254q.setValue(abstractC0696gp3);
        if (!(abstractC0696gp3 instanceof C0659fp)) {
            if (abstractC0696gp3 instanceof C0582dp) {
                c12Var = ((C0582dp) abstractC0696gp3).f17250b;
            }
            i73 i73VarMo4634a = abstractC0696gp3.mo4634a();
            this.f24249l = i73VarMo4634a;
            this.f24245h.setValue(i73VarMo4634a);
            if (this.f24243f != null && abstractC0696gp2.mo4634a() != abstractC0696gp3.mo4634a()) {
                objMo4634a = abstractC0696gp2.mo4634a();
                if (objMo4634a instanceof pm3) {
                    pm3Var = (pm3) objMo4634a;
                } else {
                    pm3Var = null;
                }
                if (pm3Var != null) {
                    pm3Var.mo41h();
                }
                Object objMo4634a2 = abstractC0696gp3.mo4634a();
                pm3Var2 = objMo4634a2 instanceof pm3 ? (pm3) objMo4634a2 : null;
                if (pm3Var2 != null) {
                    pm3Var2.mo37c();
                }
            }
            yp1Var = this.f24251n;
            if (yp1Var != null) {
                yp1Var.invoke(abstractC0696gp3);
            }
        }
        c12Var = ((C0659fp) abstractC0696gp3).f19211b;
        c12Var.mo3789a().f15002g.getClass();
        i73 i73VarMo4634a2 = abstractC0696gp3.mo4634a();
        this.f24249l = i73VarMo4634a2;
        this.f24245h.setValue(i73VarMo4634a2);
        if (this.f24243f != null) {
            objMo4634a = abstractC0696gp2.mo4634a();
            if (objMo4634a instanceof pm3) {
                pm3Var = (pm3) objMo4634a;
            } else {
                pm3Var = null;
            }
            if (pm3Var != null) {
                pm3Var.mo41h();
            }
            Object objMo4634a3 = abstractC0696gp3.mo4634a();
            if (objMo4634a3 instanceof pm3) {
            }
            if (pm3Var2 != null) {
                pm3Var2.mo37c();
            }
        }
        yp1Var = this.f24251n;
        if (yp1Var != null) {
            yp1Var.invoke(abstractC0696gp3);
        }
    }
}
