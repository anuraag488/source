package p000;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class l81 implements m81 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f23842a;

    /* JADX INFO: renamed from: b */
    public w81 f23843b;

    @Override // p000.m81
    /* JADX INFO: renamed from: g */
    public final Object mo3139g(String str) throws GeneralSecurityException {
        Exception exc = null;
        int i = 0;
        switch (this.f23842a) {
            case 0:
                w81 w81Var = this.f23843b;
                String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < 2; i2++) {
                    Provider provider = Security.getProvider(strArr[i2]);
                    if (provider != null) {
                        arrayList.add(provider);
                    }
                }
                int size = arrayList.size();
                Exception exc2 = null;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    try {
                        return w81Var.mo5607d(str, (Provider) obj);
                    } catch (Exception e) {
                        if (exc2 == null) {
                            exc2 = e;
                        }
                    }
                }
                return w81Var.mo5607d(str, null);
            default:
                String[] strArr2 = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
                ArrayList arrayList2 = new ArrayList();
                for (int i3 = 0; i3 < 3; i3++) {
                    Provider provider2 = Security.getProvider(strArr2[i3]);
                    if (provider2 != null) {
                        arrayList2.add(provider2);
                    }
                }
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    try {
                        return this.f23843b.mo5607d(str, (Provider) obj2);
                    } catch (Exception e2) {
                        if (exc == null) {
                            exc = e2;
                        }
                    }
                }
                throw new GeneralSecurityException("No good Provider found.", exc);
        }
    }
}
