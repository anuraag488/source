package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yp4 extends AbstractC1166t1 {

    /* JADX INFO: renamed from: c */
    public int f35447c;

    /* JADX INFO: renamed from: d */
    public Object[] f35448d;

    /* JADX INFO: renamed from: e */
    public boolean f35449e;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public yp4(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.f35447c = i3;
        Object[] objArr2 = new Object[i3];
        this.f35448d = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.f35449e = r5;
        objArr2[0] = objArr;
        m13212b(i - r5, 1);
    }

    /* JADX INFO: renamed from: a */
    public final Object m13211a() {
        return ((Object[]) this.f35448d[this.f35447c - 1])[this.f30715a & 31];
    }

    /* JADX INFO: renamed from: b */
    public final void m13212b(int i, int i2) {
        int i3 = (this.f35447c - i2) * 5;
        while (i2 < this.f35447c) {
            Object[] objArr = this.f35448d;
            objArr[i2] = ((Object[]) objArr[i2 - 1])[vd6.m11819C(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m13213c(int i) {
        int i2 = 0;
        while (vd6.m11819C(this.f30715a, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            m13212b(this.f30715a, ((this.f35447c - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            xy4.m12795x();
            return null;
        }
        Object objM13211a = m13211a();
        int i = this.f30715a + 1;
        this.f30715a = i;
        if (i == this.f30716b) {
            this.f35449e = true;
            return objM13211a;
        }
        m13213c(0);
        return objM13211a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            xy4.m12795x();
            return null;
        }
        this.f30715a--;
        if (this.f35449e) {
            this.f35449e = false;
            return m13211a();
        }
        m13213c(31);
        return m13211a();
    }
}
