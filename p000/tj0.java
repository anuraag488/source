package p000;

import ads_mobile_sdk.AbstractC0111f;
import ads_mobile_sdk.al3;
import ads_mobile_sdk.cr3;
import ads_mobile_sdk.el3;
import ads_mobile_sdk.ir0;
import ads_mobile_sdk.kp3;
import ads_mobile_sdk.lx3;
import ads_mobile_sdk.oy3;
import ads_mobile_sdk.oz1;
import ads_mobile_sdk.qo0;
import ads_mobile_sdk.sv1;
import ads_mobile_sdk.ts0;
import ads_mobile_sdk.zm3;
import android.content.Context;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tj0 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f31189a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f31190b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f31191c;

    public /* synthetic */ tj0(byte b) {
        this.f31189a = b;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String strM2273a;
        switch (this.f31189a) {
            case 0:
                uj0 uj0Var = (uj0) this.f31190b;
                wj0 wj0Var = (wj0) this.f31191c;
                hk0 hk0Var = uj0Var.f31904b;
                synchronized (hk0Var) {
                    FileOutputStream fileOutputStreamOpenFileOutput = hk0Var.f20633a.openFileOutput(hk0Var.f20634b, 0);
                    try {
                        fileOutputStreamOpenFileOutput.write(wj0Var.f33416a.toString().getBytes("UTF-8"));
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Throwable th) {
                        fileOutputStreamOpenFileOutput.close();
                        throw th;
                    }
                }
                return null;
            case 1:
                al3 al3Var = (al3) this.f31190b;
                Context context = (Context) this.f31191c;
                sv1 sv1VarM1260a = al3Var.f673a.m1260a();
                if (sv1VarM1260a == null) {
                    al3Var.f676d.m1894b(ir0.f5304f2);
                    return "";
                }
                synchronized (sv1VarM1260a) {
                    try {
                        qo0 qo0Var = sv1VarM1260a.f11761b;
                        oy3 oy3Var = qo0Var.f9051c;
                        lx3 lx3Var = new lx3(ir0.f5329k2, oy3Var.f8415b, oy3Var.f8414a);
                        try {
                            lx3Var.m1630b();
                            cr3 cr3Var = qo0Var.f9050b;
                            cr3Var.getClass();
                            HashMap map = new HashMap();
                            Iterator it = cr3Var.f2249a.iterator();
                            while (it.hasNext()) {
                                ((xj5) it.next()).mo215a(map);
                            }
                            qo0Var.m2055a(map);
                            lx3Var.m1628a();
                            map.put("f", "q");
                            map.put("ctx", context);
                            map.put("aid", null);
                            byte[] bArrM2276a = sv1VarM1260a.m2276a(map);
                            if (sv1VarM1260a.f11763d) {
                                map.clear();
                            }
                            strM2273a = sv1.m2273a(bArrM2276a);
                        } catch (Throwable th2) {
                            lx3Var.m1628a();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (strM2273a != null) {
                    return strM2273a;
                }
                al3Var.f676d.m1894b(ir0.f5314h2);
                return "";
            case 2:
                el3 el3Var = (el3) this.f31190b;
                Context context2 = (Context) this.f31191c;
                HashMap map2 = new HashMap();
                oy3 oy3Var2 = el3Var.f3095h;
                ir0 ir0Var = ir0.f5320i3;
                RunnableC0612eh runnableC0612eh = new RunnableC0612eh((byte) 9);
                runnableC0612eh.f18081b = el3Var;
                runnableC0612eh.f18082c = map2;
                runnableC0612eh.f18083d = context2;
                VarHandle.storeStoreFence();
                oy3Var2.m1893a(ir0Var, runnableC0612eh);
                String strM831a = el3Var.m831a(map2);
                map2.clear();
                return strM831a;
            case 3:
                oz1 oz1Var = (oz1) this.f31190b;
                zm3 zm3Var = (zm3) this.f31191c;
                DexClassLoader dexClassLoader = oz1Var.f8427l;
                kp3 kp3Var = oz1Var.f8419d;
                byte[] bArr = oz1Var.f8426k;
                String str = zm3Var.f14289a;
                String str2 = zm3Var.f14290b;
                Class<?>[] clsArr = zm3Var.f14291c;
                try {
                    kp3Var.getClass();
                    byte[] bArrM1526a = kp3.m1526a(str, bArr);
                    Charset charset = kp3.f6484a;
                    return dexClassLoader.loadClass(new String(bArrM1526a, charset)).getMethod(new String(kp3.m1526a(str2, bArr), charset), clsArr);
                } catch (ClassNotFoundException | NoSuchMethodException | NullPointerException | ta5 e) {
                    throw new IllegalStateException(e);
                }
            default:
                ts0 ts0Var = (ts0) this.f31190b;
                Object obj = this.f31191c;
                synchronized (ts0Var) {
                    ev0.m5344S(ts0Var.f12083a);
                    File file = new File(ts0Var.f12083a.getParent(), ts0Var.f12083a.getName() + ".temp");
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            switch (ts0Var.f12085c.f10610d) {
                                case 21:
                                    fileOutputStream.write((byte[]) obj);
                                    break;
                                default:
                                    ((AbstractC0111f) obj).writeTo(fileOutputStream);
                                    break;
                            }
                            fileOutputStream.close();
                            if (!file.renameTo(ts0Var.f12083a)) {
                                throw new IOException("Failed to rename file.");
                            }
                        } catch (Throwable th4) {
                            try {
                                fileOutputStream.close();
                                break;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                            throw th4;
                        }
                    } catch (IOException e2) {
                        file.delete();
                        throw e2;
                    }
                }
                return null;
        }
    }
}
