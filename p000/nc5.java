package p000;

import ads_mobile_sdk.C0183jo;
import ads_mobile_sdk.C0314rk;
import ads_mobile_sdk.EnumC0165io;
import ads_mobile_sdk.ir0;
import ads_mobile_sdk.m24;
import ads_mobile_sdk.ms0;
import ads_mobile_sdk.oy3;
import ads_mobile_sdk.qx2;
import ads_mobile_sdk.rp3;
import ads_mobile_sdk.zx2;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nc5 implements uq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f25686a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f25687b;

    public /* synthetic */ nc5(byte b) {
        this.f25686a = b;
    }

    @Override // p000.uq1
    public final Object apply(Object obj) {
        byte b = this.f25686a;
        Object obj2 = this.f25687b;
        switch (b) {
            case 0:
                return Boolean.valueOf(((fd5) obj2).mo1178a((zx2) obj));
            case 1:
                ms0 ms0Var = (ms0) obj;
                oy3 oy3Var = ((m24) obj2).f7088d;
                switch (d55.m4376u(ms0Var.x$1())) {
                    case 0:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                        ir0 ir0Var = ir0.f5281b;
                        oy3Var.f8414a.m1191a(1004, -1L, null, ((int) c75.m3870b(ms0Var.x$1())) + "");
                        throw new ha5(zp0.m13676h(c75.m3870b(ms0Var.x$1()), "r: "));
                    case 1:
                    case 2:
                        return ms0Var;
                    case 3:
                        ir0 ir0Var2 = ir0.f5281b;
                        oy3Var.f8414a.m1191a(1003, -1L, null, ((int) c75.m3870b(ms0Var.x$1())) + "");
                        throw new bb5(zp0.m13676h(c75.m3870b(ms0Var.x$1()), "r: "));
                    case 12:
                        ir0 ir0Var3 = ir0.f5281b;
                        oy3Var.f8414a.m1191a(1004, -1L, null, ((int) c75.m3870b(ms0Var.x$1())) + "");
                        throw new n95(zp0.m13676h(c75.m3870b(ms0Var.x$1()), "r: "));
                    default:
                        throw new IncompatibleClassChangeError();
                }
            case 2:
                return (ec5) obj2;
            case 3:
                qx2 qx2Var = (qx2) obj2;
                EnumC0165io enumC0165io = (EnumC0165io) obj;
                Pattern pattern = C0183jo.f5923c;
                int iOrdinal = enumC0165io.ordinal();
                if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5) {
                    return 0;
                }
                oy3 oy3Var2 = qx2Var.f10498d;
                ir0 ir0Var4 = ir0.f5281b;
                oy3Var2.f8414a.m1191a(15203, -1L, null, enumC0165io.name());
                throw new se5();
            case 4:
                C0314rk c0314rk = (C0314rk) obj2;
                String strM10150c = (String) obj;
                if (ib3.m6739a(strM10150c)) {
                    File file = new File(c0314rk.f10860a.getPackageResourcePath());
                    if (!file.exists() || !file.canRead()) {
                        return "";
                    }
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        try {
                            byte[] bArr = new byte[16384];
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
                            for (int i = fileInputStream.read(bArr); i != -1; i = fileInputStream.read(bArr)) {
                                messageDigest.update(bArr, 0, i);
                            }
                            strM10150c = C1087qx.f28858f.m10152f().m10150c(messageDigest.digest());
                            fileInputStream.close();
                        } catch (Throwable th) {
                            try {
                                fileInputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (IOException | UnsupportedOperationException | NoSuchAlgorithmException unused) {
                        return "";
                    }
                }
                return strM10150c;
            default:
                ec5 ec5Var = (ec5) obj;
                ((rp3) obj2).f10899f.set(ec5Var);
                return ec5Var;
        }
    }
}
