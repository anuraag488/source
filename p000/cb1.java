package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class cb1 implements Runnable, Comparable, w01 {
    private volatile Object _heap;

    /* JADX INFO: renamed from: a */
    public long f15912a;

    /* JADX INFO: renamed from: b */
    public int f15913b = -1;

    public cb1(long j) {
        this.f15912a = j;
    }

    @Override // p000.w01
    /* JADX INFO: renamed from: a */
    public final void mo3937a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                C0641f8 c0641f8 = fb1.f18890a;
                if (obj == c0641f8) {
                    return;
                }
                db1 db1Var = obj instanceof db1 ? (db1) obj : null;
                if (db1Var != null) {
                    synchronized (db1Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof gm4 ? (gm4) obj2 : null) != null) {
                            db1Var.m6042c(this.f15913b);
                        }
                    }
                }
                this._heap = c0641f8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m3938b(long j, db1 db1Var, eb1 eb1Var) {
        synchronized (this) {
            if (this._heap == fb1.f18890a) {
                return 2;
            }
            synchronized (db1Var) {
                try {
                    cb1[] cb1VarArr = db1Var.f19885a;
                    cb1 cb1Var = cb1VarArr != null ? cb1VarArr[0] : null;
                    int i = eb1.f17947h;
                    if (AbstractC1078qo.f28633a.getIntVolatile(eb1Var, eb1.f17945f) == 1) {
                        return 1;
                    }
                    if (cb1Var == null) {
                        db1Var.f16893c = j;
                    } else {
                        long j2 = cb1Var.f15912a;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        long j3 = db1Var.f16893c;
                        if (j - j3 > 0) {
                            db1Var.f16893c = j;
                        } else {
                            j = j3;
                        }
                    }
                    if (this.f15912a - j < 0) {
                        this.f15912a = j;
                    }
                    db1Var.m6040a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f15912a - ((cb1) obj).f15912a;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m3939d(db1 db1Var) {
        if (this._heap != fb1.f18890a) {
            this._heap = db1Var;
        } else {
            C1077qn.m9987m("Failed requirement.");
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f15912a + ']';
    }
}
