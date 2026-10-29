package p000;

import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class dr4 extends uq4 {
    @Override // p000.uq4
    /* JADX INFO: renamed from: b */
    public final Object mo166b(kb2 kb2Var) throws IOException {
        if (kb2Var.mo7481R() == 9) {
            kb2Var.mo7477N();
            return null;
        }
        String strMo7479P = kb2Var.mo7479P();
        try {
            AbstractC0647fd.m5682u(strMo7479P);
            return new BigInteger(strMo7479P);
        } catch (NumberFormatException e) {
            StringBuilder sbM10844j = sk5.m10844j("Failed parsing '", strMo7479P, "' as BigInteger; at path ");
            sbM10844j.append(kb2Var.mo7500u());
            throw new lb2(sbM10844j.toString(), e);
        }
    }

    @Override // p000.uq4
    /* JADX INFO: renamed from: c */
    public final void mo167c(yb2 yb2Var, Object obj) throws IOException {
        yb2Var.mo12201K((BigInteger) obj);
    }
}
