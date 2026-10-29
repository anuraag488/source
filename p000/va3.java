package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class va3 extends AbstractC1166t1 {

    /* JADX INFO: renamed from: c */
    public Object[] f32495c;

    /* JADX INFO: renamed from: d */
    public yp4 f32496d;

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            xy4.m12795x();
            return null;
        }
        yp4 yp4Var = this.f32496d;
        if (yp4Var.hasNext()) {
            this.f30715a++;
            return yp4Var.next();
        }
        Object[] objArr = this.f32495c;
        int i = this.f30715a;
        this.f30715a = i + 1;
        return objArr[i - yp4Var.f30716b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            xy4.m12795x();
            return null;
        }
        int i = this.f30715a;
        yp4 yp4Var = this.f32496d;
        int i2 = yp4Var.f30716b;
        if (i <= i2) {
            this.f30715a = i - 1;
            return yp4Var.previous();
        }
        Object[] objArr = this.f32495c;
        int i3 = i - 1;
        this.f30715a = i3;
        return objArr[i3 - i2];
    }
}
