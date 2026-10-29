package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wa3 extends AbstractC1166t1 {

    /* JADX INFO: renamed from: c */
    public ua3 f33193c;

    /* JADX INFO: renamed from: d */
    public int f33194d;

    /* JADX INFO: renamed from: e */
    public yp4 f33195e;

    /* JADX INFO: renamed from: f */
    public int f33196f;

    /* JADX INFO: renamed from: a */
    public final void m12187a() {
        if (this.f33194d == this.f33193c.m11355e()) {
            return;
        }
        C1077qn.m9983c();
    }

    @Override // p000.AbstractC1166t1, java.util.ListIterator
    public final void add(Object obj) {
        m12187a();
        ua3 ua3Var = this.f33193c;
        ua3Var.add(this.f30715a, obj);
        this.f30715a++;
        this.f30716b = ua3Var.mo3088a();
        this.f33194d = ua3Var.m11355e();
        this.f33196f = -1;
        m12188b();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX INFO: renamed from: b */
    public final void m12188b() {
        ua3 ua3Var = this.f33193c;
        Object[] objArr = ua3Var.f31756f;
        if (objArr == null) {
            this.f33195e = null;
            return;
        }
        int i = (ua3Var.f31758h - 1) & (-32);
        int i2 = this.f30715a;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (ua3Var.f31754d / 5) + 1;
        yp4 yp4Var = this.f33195e;
        if (yp4Var == null) {
            this.f33195e = new yp4(objArr, i2, i, i3);
            return;
        }
        yp4Var.f30715a = i2;
        yp4Var.f30716b = i;
        yp4Var.f35447c = i3;
        Object[] objArr2 = yp4Var.f35448d;
        if (objArr2.length < i3) {
            objArr2 = new Object[i3];
            yp4Var.f35448d = objArr2;
        }
        objArr2[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        yp4Var.f35449e = r0;
        yp4Var.m13212b(i2 - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        ua3 ua3Var = this.f33193c;
        m12187a();
        if (!hasNext()) {
            xy4.m12795x();
            return null;
        }
        int i = this.f30715a;
        this.f33196f = i;
        yp4 yp4Var = this.f33195e;
        if (yp4Var == null) {
            Object[] objArr = ua3Var.f31757g;
            this.f30715a = i + 1;
            return objArr[i];
        }
        if (yp4Var.hasNext()) {
            this.f30715a++;
            return yp4Var.next();
        }
        Object[] objArr2 = ua3Var.f31757g;
        int i2 = this.f30715a;
        this.f30715a = i2 + 1;
        return objArr2[i2 - yp4Var.f30716b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        ua3 ua3Var = this.f33193c;
        m12187a();
        if (!hasPrevious()) {
            xy4.m12795x();
            return null;
        }
        int i = this.f30715a;
        this.f33196f = i - 1;
        yp4 yp4Var = this.f33195e;
        if (yp4Var == null) {
            Object[] objArr = ua3Var.f31757g;
            int i2 = i - 1;
            this.f30715a = i2;
            return objArr[i2];
        }
        int i3 = yp4Var.f30716b;
        if (i <= i3) {
            this.f30715a = i - 1;
            return yp4Var.previous();
        }
        Object[] objArr2 = ua3Var.f31757g;
        int i4 = i - 1;
        this.f30715a = i4;
        return objArr2[i4 - i3];
    }

    @Override // p000.AbstractC1166t1, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        ua3 ua3Var = this.f33193c;
        m12187a();
        int i = this.f33196f;
        if (i == -1) {
            xy4.m12787p();
            return;
        }
        ua3Var.mo3089b(i);
        int i2 = this.f33196f;
        if (i2 < this.f30715a) {
            this.f30715a = i2;
        }
        this.f30716b = ua3Var.mo3088a();
        this.f33194d = ua3Var.m11355e();
        this.f33196f = -1;
        m12188b();
    }

    @Override // p000.AbstractC1166t1, java.util.ListIterator
    public final void set(Object obj) {
        m12187a();
        int i = this.f33196f;
        if (i == -1) {
            xy4.m12787p();
            return;
        }
        ua3 ua3Var = this.f33193c;
        ua3Var.set(i, obj);
        this.f33194d = ua3Var.m11355e();
        m12188b();
    }
}
