package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: q2 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1056q2 {

    /* JADX INFO: renamed from: a */
    public AbstractC1093r2[] f28150a;

    /* JADX INFO: renamed from: b */
    public int f28151b;

    /* JADX INFO: renamed from: c */
    public int f28152c;

    /* JADX INFO: renamed from: d */
    public je4 f28153d;

    /* JADX INFO: renamed from: b */
    public final AbstractC1093r2 m9699b() {
        AbstractC1093r2 abstractC1093r2Mo194c;
        je4 je4Var;
        synchronized (this) {
            try {
                AbstractC1093r2[] abstractC1093r2ArrMo195d = this.f28150a;
                if (abstractC1093r2ArrMo195d == null) {
                    abstractC1093r2ArrMo195d = mo195d();
                    this.f28150a = abstractC1093r2ArrMo195d;
                } else if (this.f28151b >= abstractC1093r2ArrMo195d.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(abstractC1093r2ArrMo195d, abstractC1093r2ArrMo195d.length * 2);
                    this.f28150a = (AbstractC1093r2[]) objArrCopyOf;
                    abstractC1093r2ArrMo195d = (AbstractC1093r2[]) objArrCopyOf;
                }
                int i = this.f28152c;
                do {
                    abstractC1093r2Mo194c = abstractC1093r2ArrMo195d[i];
                    if (abstractC1093r2Mo194c == null) {
                        abstractC1093r2Mo194c = mo194c();
                        abstractC1093r2ArrMo195d[i] = abstractC1093r2Mo194c;
                    }
                    i++;
                    if (i >= abstractC1093r2ArrMo195d.length) {
                        i = 0;
                    }
                } while (!abstractC1093r2Mo194c.mo92a(this));
                this.f28152c = i;
                this.f28151b++;
                je4Var = this.f28153d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (je4Var != null) {
            je4Var.m7088v(1);
        }
        return abstractC1093r2Mo194c;
    }

    /* JADX INFO: renamed from: c */
    public AbstractC1093r2 mo194c() {
        a54 a54Var = new a54();
        a54Var.f116a = -1L;
        return a54Var;
    }

    /* JADX INFO: renamed from: d */
    public AbstractC1093r2[] mo195d() {
        return new a54[2];
    }

    /* JADX INFO: renamed from: g */
    public final void m9700g(AbstractC1093r2 abstractC1093r2) {
        je4 je4Var;
        int i;
        wm0[] wm0VarArrMo93b;
        synchronized (this) {
            try {
                int i2 = this.f28151b - 1;
                this.f28151b = i2;
                je4Var = this.f28153d;
                if (i2 == 0) {
                    this.f28152c = 0;
                }
                wm0VarArrMo93b = abstractC1093r2.mo93b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (wm0 wm0Var : wm0VarArrMo93b) {
            if (wm0Var != null) {
                wm0Var.resumeWith(ju4.f22634a);
            }
        }
        if (je4Var != null) {
            je4Var.m7088v(-1);
        }
    }

    /* JADX INFO: renamed from: h */
    public final je4 m9701h() {
        je4 je4Var;
        synchronized (this) {
            je4Var = this.f28153d;
            if (je4Var == null) {
                int i = this.f28151b;
                je4Var = new je4(1, Integer.MAX_VALUE, y30.f34833b);
                je4Var.mo197f(Integer.valueOf(i));
                this.f28153d = je4Var;
            }
        }
        return je4Var;
    }
}
