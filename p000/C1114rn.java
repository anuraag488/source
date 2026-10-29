package p000;

/* JADX INFO: renamed from: rn */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1114rn implements InterfaceC1188tn {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f29429a;

    public /* synthetic */ C1114rn(byte b) {
        this.f29429a = b;
    }

    @Override // p000.InterfaceC1188tn
    /* JADX INFO: renamed from: g */
    public final void mo10373g(ky0 ky0Var, int i, int[] iArr, df2 df2Var, int[] iArr2) {
        switch (this.f29429a) {
            case 0:
                AbstractC1337xn.m12716b(iArr, iArr2, false);
                break;
            case 1:
                AbstractC1337xn.m12717c(i, iArr, iArr2, false);
                break;
            case 2:
                if (df2Var != df2.f17011a) {
                    AbstractC1337xn.m12716b(iArr, iArr2, true);
                } else {
                    AbstractC1337xn.m12717c(i, iArr, iArr2, false);
                }
                break;
            default:
                if (df2Var != df2.f17011a) {
                    AbstractC1337xn.m12717c(i, iArr, iArr2, true);
                } else {
                    AbstractC1337xn.m12716b(iArr, iArr2, false);
                }
                break;
        }
    }

    public final String toString() {
        switch (this.f29429a) {
            case 0:
                return "AbsoluteArrangement#Left";
            case 1:
                return "AbsoluteArrangement#Right";
            case 2:
                return "Arrangement#End";
            default:
                return "Arrangement#Start";
        }
    }
}
