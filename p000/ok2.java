package p000;

import android.os.Looper;
import java.lang.invoke.VarHandle;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ok2 extends gk2 {

    /* JADX INFO: renamed from: a */
    public final boolean f26803a;

    /* JADX INFO: renamed from: b */
    public jp0 f26804b = new jp0((byte) 19);

    /* JADX INFO: renamed from: c */
    public final w42 f26805c;

    /* JADX INFO: renamed from: d */
    public int f26806d;

    /* JADX INFO: renamed from: e */
    public boolean f26807e;

    /* JADX INFO: renamed from: f */
    public boolean f26808f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f26809g;

    /* JADX INFO: renamed from: h */
    public fk2 f26810h;

    /* JADX INFO: renamed from: i */
    public final ac4 f26811i;

    public ok2(lk2 lk2Var, boolean z) {
        this.f26803a = z;
        w42 w42Var = new w42((byte) 21, false);
        w42Var.f33090b = new WeakReference(lk2Var);
        VarHandle.storeStoreFence();
        this.f26805c = w42Var;
        this.f26809g = new ArrayList();
        fk2 fk2Var = fk2.f19055b;
        this.f26810h = fk2Var;
        this.f26811i = bc4.m3547a(fk2Var);
    }

    @Override // p000.gk2
    /* JADX INFO: renamed from: a */
    public final void mo6015a(kk2 kk2Var) {
        jk2 lw0Var;
        nk2 nk2Var;
        lk2 lk2Var;
        ek2 ek2Var;
        m9153e("addObserver");
        fk2 fk2Var = this.f26810h;
        fk2 fk2Var2 = fk2.f19054a;
        if (fk2Var != fk2Var2) {
            fk2Var2 = fk2.f19055b;
        }
        nk2 nk2Var2 = new nk2();
        nk2Var2.f25904a = fk2Var2;
        HashMap map = uk2.f31949a;
        boolean z = kk2Var instanceof jk2;
        boolean z2 = kk2Var instanceof jw0;
        byte b = 3;
        byte b2 = 2;
        if (z && z2) {
            lw0Var = new lw0((jw0) kk2Var, (jk2) kk2Var);
        } else if (z2) {
            lw0Var = new lw0((jw0) kk2Var, null);
        } else if (z) {
            lw0Var = (jk2) kk2Var;
        } else {
            Class<?> cls = kk2Var.getClass();
            if (uk2.m11579b(cls) == 2) {
                List list = (List) uk2.f31950b.get(cls);
                if (list.size() == 1) {
                    uk2.m11578a((Constructor) list.get(0), kk2Var);
                    throw null;
                }
                int size = list.size();
                nr1[] nr1VarArr = new nr1[size];
                if (size > 0) {
                    uk2.m11578a((Constructor) list.get(0), kk2Var);
                    throw null;
                }
                il3 il3Var = new il3(b2);
                il3Var.f21532b = nr1VarArr;
                VarHandle.storeStoreFence();
                lw0Var = il3Var;
            } else {
                lw0 lw0Var2 = new lw0(b);
                lw0Var2.f24410b = kk2Var;
                v90 v90Var = v90.f32473c;
                Class<?> cls2 = kk2Var.getClass();
                t90 t90VarM11769a = (t90) v90Var.f32474a.get(cls2);
                if (t90VarM11769a == null) {
                    t90VarM11769a = v90Var.m11769a(cls2, null);
                }
                lw0Var2.f24411c = t90VarM11769a;
                VarHandle.storeStoreFence();
                lw0Var = lw0Var2;
            }
        }
        nk2Var2.f25905b = lw0Var;
        jp0 jp0Var = this.f26804b;
        lw2 lw2Var = (lw2) jp0Var.f22481b;
        ad1 ad1Var = (ad1) lw2Var.m8132g(kk2Var);
        if (ad1Var != null) {
            nk2Var = ad1Var.f255b;
        } else {
            ad1 ad1Var2 = new ad1();
            ad1Var2.f254a = kk2Var;
            ad1Var2.f255b = nk2Var2;
            VarHandle.storeStoreFence();
            lw2Var.m8138m(kk2Var, ad1Var2);
            ad1 ad1Var3 = (ad1) jp0Var.f22483d;
            if (ad1Var3 == null) {
                jp0Var.f22482c = ad1Var2;
                jp0Var.f22483d = ad1Var2;
            } else {
                ad1Var3.f256c = ad1Var2;
                ad1Var2.f257d = ad1Var3;
                jp0Var.f22483d = ad1Var2;
            }
            nk2Var = null;
        }
        if (nk2Var == null && (lk2Var = (lk2) ((WeakReference) this.f26805c.f33090b).get()) != null) {
            boolean z3 = this.f26806d != 0 || this.f26807e;
            fk2 fk2VarM9152d = m9152d(kk2Var);
            this.f26806d++;
            while (nk2Var2.f25904a.compareTo(fk2VarM9152d) < 0 && ((lw2) this.f26804b.f22481b).m8128c(kk2Var)) {
                fk2 fk2Var3 = nk2Var2.f25904a;
                ArrayList arrayList = this.f26809g;
                arrayList.add(fk2Var3);
                ck2 ck2Var = ek2.Companion;
                fk2 fk2Var4 = nk2Var2.f25904a;
                ck2Var.getClass();
                int iOrdinal = fk2Var4.ordinal();
                if (iOrdinal == 1) {
                    ek2Var = ek2.ON_CREATE;
                } else if (iOrdinal != 2) {
                    ek2Var = iOrdinal != 3 ? null : ek2.ON_RESUME;
                } else {
                    ek2Var = ek2.ON_START;
                }
                if (ek2Var == null) {
                    wb1.m12197q(nk2Var2.f25904a, "no event up from ");
                    return;
                } else {
                    nk2Var2.m8790a(lk2Var, ek2Var);
                    mb0.m8264E0(arrayList);
                    fk2VarM9152d = m9152d(kk2Var);
                }
            }
            if (!z3) {
                m9157i();
            }
            this.f26806d--;
        }
    }

    @Override // p000.gk2
    /* JADX INFO: renamed from: b */
    public final fk2 mo6016b() {
        return this.f26810h;
    }

    @Override // p000.gk2
    /* JADX INFO: renamed from: c */
    public final void mo6017c(kk2 kk2Var) {
        m9153e("removeObserver");
        jp0 jp0Var = this.f26804b;
        ad1 ad1Var = (ad1) ((lw2) jp0Var.f22481b).m8136k(kk2Var);
        if (ad1Var == null) {
            return;
        }
        ad1 ad1Var2 = ad1Var.f257d;
        ad1 ad1Var3 = ad1Var.f256c;
        if (ad1Var2 == null) {
            jp0Var.f22482c = ad1Var3;
        } else {
            ad1Var2.f256c = ad1Var3;
        }
        ad1 ad1Var4 = ad1Var.f256c;
        if (ad1Var4 == null) {
            jp0Var.f22483d = ad1Var2;
        } else {
            ad1Var4.f257d = ad1Var2;
        }
        ad1Var.f258e = true;
    }

    /* JADX INFO: renamed from: d */
    public final fk2 m9152d(kk2 kk2Var) {
        ad1 ad1Var = (ad1) ((lw2) this.f26804b.f22481b).m8132g(kk2Var);
        ad1 ad1Var2 = ad1Var != null ? ad1Var.f257d : null;
        fk2 fk2Var = ad1Var2 != null ? ad1Var2.f255b.f25904a : null;
        ArrayList arrayList = this.f26809g;
        fk2 fk2Var2 = arrayList.isEmpty() ? null : (fk2) arrayList.get(arrayList.size() - 1);
        fk2 fk2Var3 = this.f26810h;
        if (fk2Var == null || fk2Var.compareTo(fk2Var3) >= 0) {
            fk2Var = fk2Var3;
        }
        return (fk2Var2 == null || fk2Var2.compareTo(fk2Var) >= 0) ? fk2Var : fk2Var2;
    }

    /* JADX INFO: renamed from: e */
    public final void m9153e(String str) {
        if (this.f26803a) {
            C0989on.m9190f0().f26895r.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            xy4.m12780h(zi4.m13621u("Method ", str, " must be called on the main thread"));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m9154f(ek2 ek2Var) {
        m9153e("handleLifecycleEvent");
        m9155g(ek2Var.m5149a());
    }

    /* JADX INFO: renamed from: g */
    public final void m9155g(fk2 fk2Var) {
        if (this.f26810h == fk2Var) {
            return;
        }
        lk2 lk2Var = (lk2) ((WeakReference) this.f26805c.f33090b).get();
        fk2 fk2Var2 = this.f26810h;
        if (fk2Var2 == fk2.f19055b && fk2Var == fk2.f19054a) {
            throw new IllegalStateException(("State must be at least '" + fk2.f19056c + "' to be moved to '" + fk2Var + "' in component " + lk2Var).toString());
        }
        fk2 fk2Var3 = fk2.f19054a;
        if (fk2Var2 == fk2Var3 && fk2Var2 != fk2Var) {
            throw new IllegalStateException(("State is '" + fk2Var3 + "' and cannot be moved to `" + fk2Var + "` in component " + lk2Var).toString());
        }
        this.f26810h = fk2Var;
        if (this.f26807e || this.f26806d != 0) {
            this.f26808f = true;
            return;
        }
        this.f26807e = true;
        m9157i();
        this.f26807e = false;
        if (this.f26810h == fk2Var3) {
            this.f26804b = new jp0((byte) 19);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m9156h(fk2 fk2Var) {
        m9153e("setCurrentState");
        m9155g(fk2Var);
    }

    /* JADX INFO: renamed from: i */
    public final void m9157i() {
        Object obj = ((WeakReference) this.f26805c.f33090b).get();
        if (obj == null) {
            C1077qn.m9989o("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        lk2 lk2Var = (lk2) obj;
        while (true) {
            jp0 jp0Var = this.f26804b;
            byte b = 0;
            if (((lw2) jp0Var.f22481b).f24422e == 0) {
                break;
            }
            ad1 ad1Var = (ad1) jp0Var.f22482c;
            if (ad1Var == null) {
                ds3.m4667k("Collection is empty.");
                return;
            }
            fk2 fk2Var = ad1Var.f255b.f25904a;
            ad1 ad1Var2 = (ad1) jp0Var.f22483d;
            if (ad1Var2 == null) {
                ds3.m4667k("Collection is empty.");
                return;
            }
            fk2 fk2Var2 = ad1Var2.f255b.f25904a;
            if (fk2Var == fk2Var2 && this.f26810h == fk2Var2) {
                break;
            }
            this.f26808f = false;
            fk2 fk2Var3 = this.f26810h;
            if (ad1Var == null) {
                ds3.m4667k("Collection is empty.");
                return;
            }
            if (fk2Var3.compareTo(fk2Var) < 0) {
                jp0 jp0Var2 = this.f26804b;
                mk2 mk2Var = new mk2(b);
                mk2Var.f24975b = this;
                mk2Var.f24976c = lk2Var;
                VarHandle.storeStoreFence();
                for (ad1 ad1Var3 = (ad1) jp0Var2.f22483d; ad1Var3 != null; ad1Var3 = ad1Var3.f257d) {
                    if (!ad1Var3.f258e) {
                        mk2Var.invoke(ad1Var3);
                    }
                }
            }
            ad1 ad1Var4 = (ad1) this.f26804b.f22483d;
            if (!this.f26808f && ad1Var4 != null && this.f26810h.compareTo(ad1Var4.f255b.f25904a) > 0) {
                jp0 jp0Var3 = this.f26804b;
                mk2 mk2Var2 = new mk2((byte) 1);
                mk2Var2.f24975b = this;
                mk2Var2.f24976c = lk2Var;
                VarHandle.storeStoreFence();
                for (ad1 ad1Var5 = (ad1) jp0Var3.f22482c; ad1Var5 != null; ad1Var5 = ad1Var5.f256c) {
                    if (!ad1Var5.f258e) {
                        mk2Var2.invoke(ad1Var5);
                    }
                }
            }
        }
        this.f26808f = false;
        this.f26811i.m199j(this.f26810h);
    }
}
