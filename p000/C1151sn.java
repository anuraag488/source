package p000;

/* JADX INFO: renamed from: sn */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1151sn implements InterfaceC1299wn {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f30399a = 1;

    @Override // p000.InterfaceC1299wn
    /* JADX INFO: renamed from: h */
    public final void mo10874h(ky0 ky0Var, int i, int[] iArr, int[] iArr2) {
        switch (this.f30399a) {
            case 0:
                AbstractC1337xn.m12717c(i, iArr, iArr2, false);
                break;
            default:
                AbstractC1337xn.m12716b(iArr, iArr2, false);
                break;
        }
    }

    public final String toString() {
        switch (this.f30399a) {
            case 0:
                return "Arrangement#Bottom";
            default:
                return "Arrangement#Top";
        }
    }
}
