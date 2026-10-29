package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lu1 extends uq4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f24378a;

    public /* synthetic */ lu1(byte b) {
        this.f24378a = b;
    }

    @Override // p000.uq4
    /* JADX INFO: renamed from: b */
    public final Object mo166b(kb2 kb2Var) throws IOException {
        switch (this.f24378a) {
            case 0:
                if (kb2Var.mo7481R() != 9) {
                    return Double.valueOf(kb2Var.mo7472D());
                }
                kb2Var.mo7477N();
                return null;
            case 1:
                if (kb2Var.mo7481R() != 9) {
                    return Float.valueOf((float) kb2Var.mo7472D());
                }
                kb2Var.mo7477N();
                return null;
            default:
                kb2Var.mo7488Y();
                return null;
        }
    }

    @Override // p000.uq4
    /* JADX INFO: renamed from: c */
    public final void mo167c(yb2 yb2Var, Object obj) throws IOException {
        switch (this.f24378a) {
            case 0:
                Number number = (Number) obj;
                if (number != null) {
                    double dDoubleValue = number.doubleValue();
                    ou1.m9268a(dDoubleValue);
                    yb2Var.mo12198C(dDoubleValue);
                } else {
                    yb2Var.mo12211t();
                }
                break;
            case 1:
                Number numberValueOf = (Number) obj;
                if (numberValueOf != null) {
                    float fFloatValue = numberValueOf.floatValue();
                    ou1.m9268a(fFloatValue);
                    if (!(numberValueOf instanceof Float)) {
                        numberValueOf = Float.valueOf(fFloatValue);
                    }
                    yb2Var.mo12201K(numberValueOf);
                } else {
                    yb2Var.mo12211t();
                }
                break;
            default:
                yb2Var.mo12211t();
                break;
        }
    }

    public String toString() {
        switch (this.f24378a) {
            case 2:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }
}
