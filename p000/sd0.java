package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sd0 implements ro0, Serializable {

    /* JADX INFO: renamed from: a */
    public final ro0 f30177a;

    /* JADX INFO: renamed from: b */
    public final po0 f30178b;

    public sd0(ro0 ro0Var, po0 po0Var) {
        this.f30177a = ro0Var;
        this.f30178b = po0Var;
    }

    public final boolean equals(Object obj) {
        boolean zM13387o;
        if (this == obj) {
            return true;
        }
        if (obj instanceof sd0) {
            sd0 sd0Var = (sd0) obj;
            int i = 2;
            sd0 sd0Var2 = sd0Var;
            int i2 = 2;
            while (true) {
                ro0 ro0Var = sd0Var2.f30177a;
                sd0Var2 = ro0Var instanceof sd0 ? (sd0) ro0Var : null;
                if (sd0Var2 == null) {
                    break;
                }
                i2++;
            }
            sd0 sd0Var3 = this;
            while (true) {
                ro0 ro0Var2 = sd0Var3.f30177a;
                sd0Var3 = ro0Var2 instanceof sd0 ? (sd0) ro0Var2 : null;
                if (sd0Var3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    po0 po0Var = this.f30178b;
                    if (!z62.m13387o(sd0Var.get(po0Var.getKey()), po0Var)) {
                        zM13387o = false;
                        break;
                    }
                    ro0 ro0Var3 = this.f30177a;
                    if (!(ro0Var3 instanceof sd0)) {
                        po0 po0Var2 = (po0) ro0Var3;
                        zM13387o = z62.m13387o(sd0Var.get(po0Var2.getKey()), po0Var2);
                        break;
                    }
                    this = (sd0) ro0Var3;
                }
                if (zM13387o) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.ro0
    public final Object fold(mq1 mq1Var, Object obj) {
        return mq1Var.invoke(this.f30177a.fold(mq1Var, obj), this.f30178b);
    }

    @Override // p000.ro0
    public final po0 get(qo0 qo0Var) {
        while (true) {
            po0 po0Var = this.f30178b.get(qo0Var);
            if (po0Var != null) {
                return po0Var;
            }
            ro0 ro0Var = this.f30177a;
            if (!(ro0Var instanceof sd0)) {
                return ro0Var.get(qo0Var);
            }
            this = (sd0) ro0Var;
        }
    }

    public final int hashCode() {
        return this.f30178b.hashCode() + this.f30177a.hashCode();
    }

    @Override // p000.ro0
    public final ro0 minusKey(qo0 qo0Var) {
        po0 po0Var = this.f30178b;
        po0 po0Var2 = po0Var.get(qo0Var);
        ro0 ro0Var = this.f30177a;
        if (po0Var2 != null) {
            return ro0Var;
        }
        ro0 ro0VarMinusKey = ro0Var.minusKey(qo0Var);
        if (ro0VarMinusKey == ro0Var) {
            return this;
        }
        return ro0VarMinusKey == r71.f29063a ? po0Var : new sd0(ro0VarMinusKey, po0Var);
    }

    @Override // p000.ro0
    public final /* bridge */ ro0 plus(ro0 ro0Var) {
        return qs5.m10089N(this, ro0Var);
    }

    public final String toString() {
        return "[" + ((String) fold(new sg0((byte) 15), "")) + ']';
    }
}
