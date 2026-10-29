package p000;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class f42 extends zp0 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ byte f18745j;

    public f42(byte[] bArr, byte b) throws GeneralSecurityException {
        this.f18745j = b;
        if (!zi4.m13603c(1)) {
            xy4.m12788q("Can not use ChaCha20Poly1305 in FIPS-mode.");
            throw null;
        }
        mo5504H(1, bArr);
        mo5504H(0, bArr);
    }

    @Override // p000.zp0
    /* JADX INFO: renamed from: H */
    public final n40 mo5504H(int i, byte[] bArr) {
        switch (this.f18745j) {
            case 0:
                break;
        }
        return new e42(bArr);
    }
}
