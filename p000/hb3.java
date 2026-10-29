package p000;

import android.util.Log;
import java.lang.invoke.VarHandle;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class hb3 {

    /* JADX INFO: renamed from: a */
    public static volatile hb3 f20468a;

    /* JADX INFO: renamed from: b */
    public static final Logger f20469b;

    /* JADX WARN: Code duplicated, block: B:32:0x00be A[PHI: r0
  0x00be: PHI (r0v36 hb3) = (r0v15 hb3), (r0v18 hb3), (r0v26 hb3), (r0v30 hb3), (r0v34 hb3), (r0v45 hb3) binds: [B:61:0x012c, B:73:0x018e, B:55:0x011e, B:47:0x00fe, B:39:0x00de, B:30:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:49:0x0101  */
    /* JADX WARN: Code duplicated, block: B:51:0x0113  */
    /* JADX WARN: Code duplicated, block: B:53:0x0117  */
    /* JADX WARN: Code duplicated, block: B:54:0x011d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0121  */
    /* JADX WARN: Code duplicated, block: B:59:0x0125  */
    /* JADX WARN: Code duplicated, block: B:60:0x012b  */
    /* JADX WARN: Code duplicated, block: B:63:0x012f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0140  */
    /* JADX WARN: Code duplicated, block: B:73:0x018e  */
    static {
        hb3 hb3Var;
        s82 s82Var;
        l43 l43Var;
        d20 d20Var;
        xk0 xk0Var;
        int i = 0;
        hb3 hb3Var2 = null;
        hb3Var2 = null;
        hb3Var2 = null;
        if (sc6.m10635G()) {
            for (Map.Entry entry : AbstractC1105re.f29200b.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (AbstractC1105re.f29199a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(C1142se.f30187a);
                }
            }
            if (C1065qb.f28349d) {
                C1065qb c1065qb = new C1065qb();
                ArrayList arrayListM9209d0 = AbstractC0990oo.m9209d0(new ca4[]{sc6.m10635G() ? new C1102rb() : null, new kx0(C1107rg.f29229f), new kx0(zk0.f36158a), new kx0(f20.f18670a)});
                ArrayList arrayList = new ArrayList();
                int size = arrayListM9209d0.size();
                while (i < size) {
                    Object obj = arrayListM9209d0.get(i);
                    i++;
                    if (((ca4) obj).mo3935c()) {
                        arrayList.add(obj);
                    }
                }
                c1065qb.f28350c = arrayList;
                VarHandle.storeStoreFence();
                hb3Var = c1065qb;
            } else {
                hb3Var = null;
            }
            if (hb3Var == null) {
                int i2 = AbstractC0610ef.f18039c;
            } else {
                hb3Var = s82Var;
                hb3Var = l43Var;
                hb3Var = d20Var;
                hb3Var = xk0Var;
                hb3Var2 = hb3Var;
            }
        } else if ("Conscrypt".equals(Security.getProviders()[0].getName())) {
            if (xk0.f34325d) {
                xk0Var = new xk0();
            } else {
                hb3Var = null;
            }
            if (hb3Var != null) {
                hb3Var = s82Var;
                hb3Var = l43Var;
                hb3Var = d20Var;
                hb3Var = xk0Var;
                hb3Var2 = hb3Var;
            } else {
                hb3Var = xk0Var;
                if ("BC".equals(Security.getProviders()[0].getName())) {
                    if (d20.f16739d) {
                        d20Var = new d20();
                    } else {
                        hb3Var = null;
                    }
                    if (hb3Var != null) {
                        hb3Var = s82Var;
                        hb3Var = l43Var;
                        hb3Var = d20Var;
                        hb3Var = xk0Var;
                        hb3Var2 = hb3Var;
                    } else {
                        hb3Var = d20Var;
                        if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                            if (l43.f23781d) {
                                l43Var = new l43();
                            } else {
                                hb3Var = null;
                            }
                            if (hb3Var != null) {
                                hb3Var = s82Var;
                                hb3Var = l43Var;
                                hb3Var = d20Var;
                                hb3Var = xk0Var;
                                hb3Var2 = hb3Var;
                            } else {
                                hb3Var = l43Var;
                                if (s82.f29967c) {
                                    s82Var = new s82();
                                } else {
                                    hb3Var = null;
                                }
                                if (hb3Var != null) {
                                    hb3Var = s82Var;
                                    hb3Var = l43Var;
                                    hb3Var = d20Var;
                                    hb3Var = xk0Var;
                                    hb3Var2 = hb3Var;
                                } else {
                                    hb3Var = s82Var;
                                    if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) < 9) {
                                        Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                        Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                        Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                        Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                        Method method = cls.getMethod("put", SSLSocket.class, cls2);
                                        Method method2 = cls.getMethod("get", SSLSocket.class);
                                        Method method3 = cls.getMethod("remove", SSLSocket.class);
                                        r82 r82Var = new r82();
                                        r82Var.f29084c = method;
                                        r82Var.f29085d = method2;
                                        r82Var.f29086e = method3;
                                        r82Var.f29087f = cls3;
                                        r82Var.f29088g = cls4;
                                        VarHandle.storeStoreFence();
                                        hb3Var2 = r82Var;
                                    }
                                    if (hb3Var2 == null) {
                                        hb3Var = new hb3();
                                        hb3Var = s82Var;
                                        hb3Var = l43Var;
                                        hb3Var = d20Var;
                                        hb3Var = xk0Var;
                                        hb3Var2 = hb3Var;
                                    }
                                }
                            }
                        } else {
                            hb3Var = l43Var;
                            if (s82.f29967c) {
                                s82Var = new s82();
                            } else {
                                hb3Var = null;
                            }
                            if (hb3Var != null) {
                                hb3Var = s82Var;
                                hb3Var = l43Var;
                                hb3Var = d20Var;
                                hb3Var = xk0Var;
                                hb3Var2 = hb3Var;
                            } else {
                                hb3Var = s82Var;
                                if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) < 9) {
                                    Class<?> cls5 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                    Class<?> cls6 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                    Class<?> cls7 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                    Class<?> cls8 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                    Method method4 = cls5.getMethod("put", SSLSocket.class, cls6);
                                    Method method5 = cls5.getMethod("get", SSLSocket.class);
                                    Method method6 = cls5.getMethod("remove", SSLSocket.class);
                                    r82 r82Var2 = new r82();
                                    r82Var2.f29084c = method4;
                                    r82Var2.f29085d = method5;
                                    r82Var2.f29086e = method6;
                                    r82Var2.f29087f = cls7;
                                    r82Var2.f29088g = cls8;
                                    VarHandle.storeStoreFence();
                                    hb3Var2 = r82Var2;
                                }
                                if (hb3Var2 == null) {
                                    hb3Var = new hb3();
                                    hb3Var = s82Var;
                                    hb3Var = l43Var;
                                    hb3Var = d20Var;
                                    hb3Var = xk0Var;
                                    hb3Var2 = hb3Var;
                                }
                            }
                        }
                    }
                } else {
                    hb3Var = d20Var;
                    if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                        hb3Var = l43Var;
                        if (s82.f29967c) {
                            s82Var = new s82();
                        } else {
                            hb3Var = null;
                        }
                        if (hb3Var != null) {
                            hb3Var = s82Var;
                            hb3Var = l43Var;
                            hb3Var = d20Var;
                            hb3Var = xk0Var;
                            hb3Var2 = hb3Var;
                        } else {
                            hb3Var = s82Var;
                            if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) < 9) {
                                Class<?> cls9 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                Class<?> cls10 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                Class<?> cls11 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                Class<?> cls12 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                Method method7 = cls9.getMethod("put", SSLSocket.class, cls10);
                                Method method8 = cls9.getMethod("get", SSLSocket.class);
                                Method method9 = cls9.getMethod("remove", SSLSocket.class);
                                r82 r82Var3 = new r82();
                                r82Var3.f29084c = method7;
                                r82Var3.f29085d = method8;
                                r82Var3.f29086e = method9;
                                r82Var3.f29087f = cls11;
                                r82Var3.f29088g = cls12;
                                VarHandle.storeStoreFence();
                                hb3Var2 = r82Var3;
                            }
                            if (hb3Var2 == null) {
                                hb3Var = new hb3();
                                hb3Var = s82Var;
                                hb3Var = l43Var;
                                hb3Var = d20Var;
                                hb3Var = xk0Var;
                                hb3Var2 = hb3Var;
                            }
                        }
                    } else {
                        if (l43.f23781d) {
                            l43Var = new l43();
                        } else {
                            hb3Var = null;
                        }
                        if (hb3Var != null) {
                            hb3Var = s82Var;
                            hb3Var = l43Var;
                            hb3Var = d20Var;
                            hb3Var = xk0Var;
                            hb3Var2 = hb3Var;
                        } else {
                            hb3Var = l43Var;
                            if (s82.f29967c) {
                                s82Var = new s82();
                            } else {
                                hb3Var = null;
                            }
                            if (hb3Var != null) {
                                hb3Var = s82Var;
                                hb3Var = l43Var;
                                hb3Var = d20Var;
                                hb3Var = xk0Var;
                                hb3Var2 = hb3Var;
                            } else {
                                hb3Var = s82Var;
                                if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) < 9) {
                                    Class<?> cls13 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                    Class<?> cls14 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                    Class<?> cls15 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                    Class<?> cls16 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                    Method method10 = cls13.getMethod("put", SSLSocket.class, cls14);
                                    Method method11 = cls13.getMethod("get", SSLSocket.class);
                                    Method method12 = cls13.getMethod("remove", SSLSocket.class);
                                    r82 r82Var4 = new r82();
                                    r82Var4.f29084c = method10;
                                    r82Var4.f29085d = method11;
                                    r82Var4.f29086e = method12;
                                    r82Var4.f29087f = cls15;
                                    r82Var4.f29088g = cls16;
                                    VarHandle.storeStoreFence();
                                    hb3Var2 = r82Var4;
                                }
                                if (hb3Var2 == null) {
                                    hb3Var = new hb3();
                                    hb3Var = s82Var;
                                    hb3Var = l43Var;
                                    hb3Var = d20Var;
                                    hb3Var = xk0Var;
                                    hb3Var2 = hb3Var;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            hb3Var = xk0Var;
            if ("BC".equals(Security.getProviders()[0].getName())) {
                hb3Var = d20Var;
                if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                    hb3Var = l43Var;
                    if (s82.f29967c) {
                        s82Var = new s82();
                    } else {
                        hb3Var = null;
                    }
                    if (hb3Var != null) {
                        hb3Var = s82Var;
                        hb3Var = l43Var;
                        hb3Var = d20Var;
                        hb3Var = xk0Var;
                        hb3Var2 = hb3Var;
                    } else {
                        hb3Var = s82Var;
                        try {
                            if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) < 9) {
                                try {
                                    Class<?> cls17 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                    Class<?> cls18 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                    Class<?> cls19 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                    Class<?> cls110 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                    Method method13 = cls17.getMethod("put", SSLSocket.class, cls18);
                                    Method method14 = cls17.getMethod("get", SSLSocket.class);
                                    Method method15 = cls17.getMethod("remove", SSLSocket.class);
                                    r82 r82Var5 = new r82();
                                    r82Var5.f29084c = method13;
                                    r82Var5.f29085d = method14;
                                    r82Var5.f29086e = method15;
                                    r82Var5.f29087f = cls19;
                                    r82Var5.f29088g = cls110;
                                    VarHandle.storeStoreFence();
                                    hb3Var2 = r82Var5;
                                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                                }
                            }
                        } catch (NumberFormatException unused2) {
                        }
                        if (hb3Var2 == null) {
                            hb3Var = new hb3();
                            hb3Var = s82Var;
                            hb3Var = l43Var;
                            hb3Var = d20Var;
                            hb3Var = xk0Var;
                            hb3Var2 = hb3Var;
                        }
                    }
                } else {
                    if (l43.f23781d) {
                        l43Var = new l43();
                    } else {
                        hb3Var = null;
                    }
                    if (hb3Var != null) {
                        hb3Var = s82Var;
                        hb3Var = l43Var;
                        hb3Var = d20Var;
                        hb3Var = xk0Var;
                        hb3Var2 = hb3Var;
                    } else {
                        hb3Var = l43Var;
                        if (s82.f29967c) {
                            s82Var = new s82();
                        } else {
                            hb3Var = null;
                        }
                        if (hb3Var != null) {
                            hb3Var = s82Var;
                            hb3Var = l43Var;
                            hb3Var = d20Var;
                            hb3Var = xk0Var;
                            hb3Var2 = hb3Var;
                        } else {
                            hb3Var = s82Var;
                            if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) < 9) {
                                Class<?> cls111 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                Class<?> cls112 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                Class<?> cls113 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                Class<?> cls114 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                Method method16 = cls111.getMethod("put", SSLSocket.class, cls112);
                                Method method17 = cls111.getMethod("get", SSLSocket.class);
                                Method method18 = cls111.getMethod("remove", SSLSocket.class);
                                r82 r82Var6 = new r82();
                                r82Var6.f29084c = method16;
                                r82Var6.f29085d = method17;
                                r82Var6.f29086e = method18;
                                r82Var6.f29087f = cls113;
                                r82Var6.f29088g = cls114;
                                VarHandle.storeStoreFence();
                                hb3Var2 = r82Var6;
                            }
                            if (hb3Var2 == null) {
                                hb3Var = new hb3();
                                hb3Var = s82Var;
                                hb3Var = l43Var;
                                hb3Var = d20Var;
                                hb3Var = xk0Var;
                                hb3Var2 = hb3Var;
                            }
                        }
                    }
                }
            } else {
                if (d20.f16739d) {
                    d20Var = new d20();
                } else {
                    hb3Var = null;
                }
                if (hb3Var != null) {
                    hb3Var = s82Var;
                    hb3Var = l43Var;
                    hb3Var = d20Var;
                    hb3Var = xk0Var;
                    hb3Var2 = hb3Var;
                } else {
                    hb3Var = d20Var;
                    if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                        hb3Var = l43Var;
                        if (s82.f29967c) {
                            s82Var = new s82();
                        } else {
                            hb3Var = null;
                        }
                        if (hb3Var != null) {
                            hb3Var = s82Var;
                            hb3Var = l43Var;
                            hb3Var = d20Var;
                            hb3Var = xk0Var;
                            hb3Var2 = hb3Var;
                        } else {
                            hb3Var = s82Var;
                            if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) < 9) {
                                Class<?> cls115 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                Class<?> cls116 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                Class<?> cls117 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                Class<?> cls118 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                Method method19 = cls115.getMethod("put", SSLSocket.class, cls116);
                                Method method110 = cls115.getMethod("get", SSLSocket.class);
                                Method method111 = cls115.getMethod("remove", SSLSocket.class);
                                r82 r82Var7 = new r82();
                                r82Var7.f29084c = method19;
                                r82Var7.f29085d = method110;
                                r82Var7.f29086e = method111;
                                r82Var7.f29087f = cls117;
                                r82Var7.f29088g = cls118;
                                VarHandle.storeStoreFence();
                                hb3Var2 = r82Var7;
                            }
                            if (hb3Var2 == null) {
                                hb3Var = new hb3();
                                hb3Var = s82Var;
                                hb3Var = l43Var;
                                hb3Var = d20Var;
                                hb3Var = xk0Var;
                                hb3Var2 = hb3Var;
                            }
                        }
                    } else {
                        if (l43.f23781d) {
                            l43Var = new l43();
                        } else {
                            hb3Var = null;
                        }
                        if (hb3Var != null) {
                            hb3Var = s82Var;
                            hb3Var = l43Var;
                            hb3Var = d20Var;
                            hb3Var = xk0Var;
                            hb3Var2 = hb3Var;
                        } else {
                            hb3Var = l43Var;
                            if (s82.f29967c) {
                                s82Var = new s82();
                            } else {
                                hb3Var = null;
                            }
                            if (hb3Var != null) {
                                hb3Var = s82Var;
                                hb3Var = l43Var;
                                hb3Var = d20Var;
                                hb3Var = xk0Var;
                                hb3Var2 = hb3Var;
                            } else {
                                hb3Var = s82Var;
                                if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) < 9) {
                                    Class<?> cls119 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                    Class<?> cls1110 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                    Class<?> cls1111 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                    Class<?> cls1112 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                    Method method112 = cls119.getMethod("put", SSLSocket.class, cls1110);
                                    Method method113 = cls119.getMethod("get", SSLSocket.class);
                                    Method method114 = cls119.getMethod("remove", SSLSocket.class);
                                    r82 r82Var8 = new r82();
                                    r82Var8.f29084c = method112;
                                    r82Var8.f29085d = method113;
                                    r82Var8.f29086e = method114;
                                    r82Var8.f29087f = cls1111;
                                    r82Var8.f29088g = cls1112;
                                    VarHandle.storeStoreFence();
                                    hb3Var2 = r82Var8;
                                }
                                if (hb3Var2 == null) {
                                    hb3Var = new hb3();
                                    hb3Var = s82Var;
                                    hb3Var = l43Var;
                                    hb3Var = d20Var;
                                    hb3Var = xk0Var;
                                    hb3Var2 = hb3Var;
                                }
                            }
                        }
                    }
                }
            }
        }
        f20468a = hb3Var2;
        f20469b = Logger.getLogger(h33.class.getName());
    }

    /* JADX INFO: renamed from: f */
    public static void m6326f(int i, String str, Throwable th) {
        f20469b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* JADX INFO: renamed from: b */
    public n40 mo6328b(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        X509Certificate[] x509CertificateArr = (X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length);
        C1422zy c1422zy = new C1422zy();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((Set) linkedHashSet).add(x509Certificate);
        }
        c1422zy.f36457a = linkedHashMap;
        VarHandle.storeStoreFence();
        C0591dy c0591dy = new C0591dy();
        c0591dy.f17488j = c1422zy;
        VarHandle.storeStoreFence();
        return c0591dy;
    }

    /* JADX INFO: renamed from: d */
    public String mo4283d(SSLSocket sSLSocket) {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo6329e(String str) {
        return true;
    }

    /* JADX INFO: renamed from: g */
    public SSLContext mo4284g() {
        return SSLContext.getInstance("TLS");
    }

    /* JADX INFO: renamed from: h */
    public SSLSocketFactory mo6330h(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContextMo4284g = mo4284g();
            sSLContextMo4284g.init(null, new TrustManager[]{x509TrustManager}, null);
            return sSLContextMo4284g.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    /* JADX INFO: renamed from: i */
    public X509TrustManager mo4285i() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        xy4.m12780h("Unexpected default trust managers: ".concat(Arrays.toString(trustManagers)));
        return null;
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: a */
    public void mo6327a(SSLSocket sSLSocket) {
    }

    /* JADX INFO: renamed from: c */
    public void mo4282c(SSLSocket sSLSocket, String str, List list) {
    }
}
