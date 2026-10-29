package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bq4 extends aq4 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ byte f15507d;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f15507d) {
            case 0:
                int i = this.f14780c;
                this.f14780c = i + 2;
                Object[] objArr = this.f14778a;
                return new vp2(objArr[i], objArr[i + 1]);
            case 1:
                int i2 = this.f14780c;
                this.f14780c = i2 + 2;
                return this.f14778a[i2];
            default:
                int i3 = this.f14780c;
                this.f14780c = i3 + 2;
                return this.f14778a[i3 + 1];
        }
    }
}
