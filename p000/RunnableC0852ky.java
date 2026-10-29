package p000;

import ads_mobile_sdk.q91;
import ads_mobile_sdk.r91;
import android.os.Trace;
import java.io.BufferedOutputStream;
import java.lang.invoke.VarHandle;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: ky */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0852ky implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f23603a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ String f23604b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f23605c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f23606d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f23607e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f23608f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f23609g;

    public /* synthetic */ RunnableC0852ky(byte b) {
        this.f23603a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rw2 rw2VarMo6057C;
        Throwable th;
        SocketTimeoutException socketTimeoutException;
        HttpURLConnection httpURLConnection = null;
        switch (this.f23603a) {
            case 0:
                xl4 xl4Var = (xl4) this.f23606d;
                df2 df2Var = (df2) this.f23607e;
                String str = this.f23604b;
                ky0 ky0Var = (ky0) this.f23608f;
                am1 am1Var = (am1) this.f23609g;
                boolean z = this.f23605c;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    e94 e94VarM7451h = k94.m7451h();
                    rw2 rw2Var = e94VarM7451h instanceof rw2 ? (rw2) e94VarM7451h : null;
                    if (rw2Var == null || (rw2VarMo6057C = rw2Var.mo6057C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        e94 e94VarM5018j = rw2VarMo6057C.m5018j();
                        try {
                            xl4 xl4VarM13512I = zc6.m13512I(xl4Var, df2Var);
                            v71 v71Var = v71.f32439a;
                            C0452af c0452afM13773d = zt5.m13773d(str, xl4VarM13512I, v71Var, ky0Var, am1Var, v71Var, z);
                            c0452afM13773d.mo2952c();
                            c0452afM13773d.mo2950a();
                            e94.m5011q(e94VarM5018j);
                            rw2VarMo6057C.mo3385w().mo5617T();
                            rw2VarMo6057C.mo3384c();
                            Trace.endSection();
                            return;
                        } catch (Throwable th2) {
                            e94.m5011q(e94VarM5018j);
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            rw2VarMo6057C.mo3384c();
                            throw th4;
                        }
                    }
                } catch (Throwable th5) {
                    Trace.endSection();
                    throw th5;
                }
            default:
                r91 r91Var = (r91) this.f23606d;
                String str2 = this.f23604b;
                m60 m60Var = (m60) this.f23607e;
                boolean z2 = this.f23605c;
                String str3 = (String) this.f23608f;
                byte[] bArr = (byte[]) this.f23609g;
                long j = r91Var.f10606c;
                try {
                    try {
                        HttpURLConnection httpURLConnection2 = (HttpURLConnection) URI.create(str2).toURL().openConnection();
                        try {
                            Objects.requireNonNull(httpURLConnection2);
                            RunnableC1054q0 runnableC1054q0 = new RunnableC1054q0((byte) 24);
                            runnableC1054q0.f28115b = httpURLConnection2;
                            VarHandle.storeStoreFence();
                            ExecutorService executorService = r91Var.f10604a;
                            no3 no3Var = m60Var.f24680c;
                            if (no3Var != null) {
                                no3Var.mo6454a(runnableC1054q0, executorService);
                            }
                            httpURLConnection2.setRequestProperty("User-Agent", r91Var.f10605b);
                            int i = (int) j;
                            httpURLConnection2.setConnectTimeout(i);
                            httpURLConnection2.setReadTimeout(i);
                            if (z2) {
                                httpURLConnection2.setDoOutput(true);
                                httpURLConnection2.setRequestMethod("POST");
                                if (str3 != null) {
                                    httpURLConnection2.setRequestProperty("Content-Type", str3);
                                }
                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                                try {
                                    bufferedOutputStream.write(bArr);
                                    bufferedOutputStream.close();
                                } catch (Throwable th6) {
                                    try {
                                        bufferedOutputStream.close();
                                        throw th6;
                                    } catch (Throwable th7) {
                                        th6.addSuppressed(th7);
                                        throw th6;
                                    }
                                }
                            }
                            int responseCode = httpURLConnection2.getResponseCode();
                            byte[] bArrM2087a = r91.m2087a(httpURLConnection2, responseCode);
                            q91 q91Var = new q91();
                            q91Var.f8907a = responseCode;
                            q91Var.f8908b = bArrM2087a;
                            VarHandle.storeStoreFence();
                            m60Var.m8198a(q91Var);
                            httpURLConnection2.disconnect();
                            return;
                        } catch (SocketTimeoutException e) {
                            socketTimeoutException = e;
                            httpURLConnection = httpURLConnection2;
                            m60Var.m8199b(new TimeoutException("Timeout: " + socketTimeoutException.getMessage()));
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            return;
                        } catch (Throwable th8) {
                            th = th8;
                            httpURLConnection = httpURLConnection2;
                            m60Var.m8199b(th);
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            return;
                        }
                    } catch (SocketTimeoutException e2) {
                        socketTimeoutException = e2;
                    } catch (Throwable th9) {
                        th = th9;
                    }
                } catch (Throwable th10) {
                    if (httpURLConnection == null) {
                        throw th10;
                    }
                    httpURLConnection.disconnect();
                    throw th10;
                }
                break;
        }
    }
}
