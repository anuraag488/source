package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class gm4 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ long f19884b = AbstractC1078qo.f28633a.objectFieldOffset(gm4.class.getDeclaredField("_size$volatile"));
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a */
    public cb1[] f19885a;

    /* JADX INFO: renamed from: a */
    public final void m6040a(cb1 cb1Var) {
        cb1Var.m3939d((db1) this);
        cb1[] cb1VarArr = this.f19885a;
        if (cb1VarArr == null) {
            cb1VarArr = new cb1[4];
            this.f19885a = cb1VarArr;
        } else if (m6041b() >= cb1VarArr.length) {
            cb1VarArr = (cb1[]) Arrays.copyOf(cb1VarArr, m6041b() * 2);
            this.f19885a = cb1VarArr;
        }
        int iM6041b = m6041b();
        AbstractC1078qo.f28633a.putIntVolatile(this, f19884b, iM6041b + 1);
        cb1VarArr[iM6041b] = cb1Var;
        cb1Var.f15913b = iM6041b;
        while (iM6041b > 0) {
            Object[] objArr = this.f19885a;
            int i = (iM6041b - 1) / 2;
            if (objArr[i].compareTo(objArr[iM6041b]) <= 0) {
                return;
            }
            m6043d(iM6041b, i);
            iM6041b = i;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m6041b() {
        return AbstractC1078qo.f28633a.getIntVolatile(this, f19884b);
    }

    /* JADX INFO: renamed from: c */
    public final cb1 m6042c(int i) {
        Object[] objArr = this.f19885a;
        AbstractC1078qo.f28633a.putIntVolatile(this, f19884b, m6041b() - 1);
        if (i < m6041b()) {
            m6043d(i, m6041b());
            int i2 = (i - 1) / 2;
            if (i <= 0 || objArr[i].compareTo(objArr[i2]) >= 0) {
                while (true) {
                    int i3 = i * 2;
                    int i4 = i3 + 1;
                    if (i4 >= m6041b()) {
                        break;
                    }
                    Object[] objArr2 = this.f19885a;
                    int i5 = i3 + 2;
                    if (i5 >= m6041b() || objArr2[i5].compareTo(objArr2[i4]) >= 0) {
                        i5 = i4;
                    }
                    if (objArr2[i].compareTo(objArr2[i5]) <= 0) {
                        break;
                    }
                    m6043d(i, i5);
                    i = i5;
                }
            } else {
                m6043d(i, i2);
                while (i2 > 0) {
                    Object[] objArr3 = this.f19885a;
                    int i6 = (i2 - 1) / 2;
                    if (objArr3[i6].compareTo(objArr3[i2]) <= 0) {
                        break;
                    }
                    m6043d(i2, i6);
                    i2 = i6;
                }
            }
        }
        cb1 cb1Var = objArr[m6041b()];
        cb1Var.m3939d(null);
        cb1Var.f15913b = -1;
        objArr[m6041b()] = null;
        return cb1Var;
    }

    /* JADX INFO: renamed from: d */
    public final void m6043d(int i, int i2) {
        cb1[] cb1VarArr = this.f19885a;
        cb1 cb1Var = cb1VarArr[i2];
        cb1 cb1Var2 = cb1VarArr[i];
        cb1VarArr[i] = cb1Var;
        cb1VarArr[i2] = cb1Var2;
        cb1Var.f15913b = i;
        cb1Var2.f15913b = i2;
    }
}
