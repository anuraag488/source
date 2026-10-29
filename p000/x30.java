package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class x30 extends AbstractC1166t1 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ byte f33951c;

    /* JADX INFO: renamed from: d */
    public Object f33952d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x30(int i, int i2, byte b) {
        super(i, i2);
        this.f33951c = b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f33951c) {
            case 0:
                if (!hasNext()) {
                    xy4.m12795x();
                    return null;
                }
                Object[] objArr = (Object[]) this.f33952d;
                int i = this.f30715a;
                this.f30715a = i + 1;
                return objArr[i];
            default:
                if (hasNext()) {
                    this.f30715a++;
                    return this.f33952d;
                }
                xy4.m12795x();
                return null;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f33951c) {
            case 0:
                if (!hasPrevious()) {
                    xy4.m12795x();
                    return null;
                }
                Object[] objArr = (Object[]) this.f33952d;
                int i = this.f30715a - 1;
                this.f30715a = i;
                return objArr[i];
            default:
                if (hasPrevious()) {
                    this.f30715a--;
                    return this.f33952d;
                }
                xy4.m12795x();
                return null;
        }
    }
}
