package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class ar4 extends uq4 {
    @Override // p000.uq4
    /* JADX INFO: renamed from: b */
    public final Object mo166b(kb2 kb2Var) throws IOException {
        if (kb2Var.mo7481R() == 9) {
            kb2Var.mo7477N();
            return null;
        }
        String strMo7479P = kb2Var.mo7479P();
        if (strMo7479P.length() == 1) {
            return Character.valueOf(strMo7479P.charAt(0));
        }
        StringBuilder sbM10844j = sk5.m10844j("Expecting character, got: ", strMo7479P, "; at ");
        sbM10844j.append(kb2Var.mo7500u());
        throw new lb2(sbM10844j.toString());
    }

    @Override // p000.uq4
    /* JADX INFO: renamed from: c */
    public final void mo167c(yb2 yb2Var, Object obj) throws IOException {
        Character ch = (Character) obj;
        yb2Var.mo12202L(ch == null ? null : String.valueOf(ch));
    }
}
