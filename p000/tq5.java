package p000;

import android.app.Activity;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.invoke.VarHandle;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tq5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f31340a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f31341b;

    /* JADX INFO: renamed from: c */
    public Object f31342c;

    /* JADX INFO: renamed from: d */
    public String f31343d;

    /* JADX INFO: renamed from: e */
    public Object f31344e;

    /* JADX INFO: renamed from: f */
    public Map f31345f;

    /* JADX INFO: renamed from: g */
    public Object f31346g;

    public tq5(q76 q76Var, String str, URL url, byte[] bArr, Map map, k76 k76Var) {
        this.f31340a = (byte) 2;
        Objects.requireNonNull(q76Var);
        this.f31341b = q76Var;
        y42.m12851X(str);
        y42.m12854a0(url);
        this.f31346g = url;
        this.f31342c = bArr;
        this.f31344e = k76Var;
        this.f31343d = str;
        this.f31345f = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public void m11089a(int i, IOException iOException, byte[] bArr, Map map) {
        ea6 ea6Var = ((oa6) ((wg6) this.f31341b).f36084a).f26515g;
        oa6.m9016l(ea6Var);
        tg6 tg6Var = new tg6((byte) 0);
        tg6Var.f31156c = this;
        tg6Var.f31155b = i;
        tg6Var.f31157d = iOException;
        tg6Var.f31158e = bArr;
        VarHandle.storeStoreFence();
        ea6Var.m5033D(tg6Var);
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0252 A[Catch: all -> 0x0256, LOOP:3: B:123:0x024c->B:125:0x0252, LOOP_END, TryCatch #31 {all -> 0x0256, blocks: (B:122:0x024a, B:123:0x024c, B:125:0x0252, B:128:0x0258), top: B:208:0x024a }] */
    /* JADX WARN: Code duplicated, block: B:172:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:182:0x0303  */
    /* JADX WARN: Code duplicated, block: B:191:0x02ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x0142 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x02ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0157  */
    /* JADX WARN: Code duplicated, block: B:89:0x0179  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r19v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r20v0, types: [tq5] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.Map] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        OutputStream outputStream;
        Throwable th;
        HttpURLConnection httpURLConnection;
        OutputStream outputStream2;
        IOException iOException;
        OutputStream outputStream3;
        int responseCode;
        ?? r19;
        v66 v66Var;
        ea6 ea6Var;
        ?? r110;
        Map<String, List<String>> headerFields;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        int i;
        Throwable th2;
        HttpURLConnection httpURLConnection2;
        OutputStream outputStream4;
        ?? r5;
        IOException iOException2;
        ?? r6;
        String str;
        String str2;
        InputStream inputStream2;
        String str3 = "Content-Encoding";
        int i2 = 0;
        switch (this.f31340a) {
            case 0:
                ((xq5) this.f31346g).f34546k.m6162g((Activity) this.f31342c, this.f31343d, (String) this.f31344e, (wx1) this.f31341b, this.f31345f, false);
                return;
            case 1:
                gs5 gs5Var = ((xq5) this.f31346g).f34546k;
                gs5Var.m6159c();
                wx1 wx1Var = (wx1) this.f31341b;
                if (wx1Var != null) {
                    Map map = this.f31345f;
                    gs5Var.m6162g((Activity) this.f31342c, this.f31343d, (String) this.f31344e, wx1Var, map, false);
                    return;
                }
                return;
            case 2:
                k76 k76Var = (k76) this.f31344e;
                String str4 = this.f31343d;
                q76 q76Var = (q76) this.f31341b;
                oa6 oa6Var = (oa6) q76Var.f36084a;
                oa6 oa6Var2 = (oa6) q76Var.f36084a;
                ea6 ea6Var2 = oa6Var.f26515g;
                oa6.m9016l(ea6Var2);
                ea6Var2.m5039y();
                try {
                    URLConnection uRLConnectionOpenConnection = ((URL) this.f31346g).openConnection();
                    if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                        httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                        httpURLConnection.setDefaultUseCaches(false);
                        op5 op5Var = oa6Var2.f26512d;
                        httpURLConnection.setConnectTimeout(60000);
                        httpURLConnection.setReadTimeout(61000);
                        httpURLConnection.setInstanceFollowRedirects(false);
                        httpURLConnection.setDoInput(true);
                        try {
                            Map map2 = this.f31345f;
                            if (map2 != null) {
                                for (Map.Entry entry : map2.entrySet()) {
                                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                }
                            }
                            byte[] bArr2 = (byte[]) this.f31342c;
                            if (bArr2 != null) {
                                q76 q76Var2 = q76Var.f19870f.f28597g;
                                qm6.m9925S(q76Var2);
                                byte[] bArrM9797j0 = q76Var2.m9797j0(bArr2);
                                d76 d76Var = oa6Var2.f26514f;
                                oa6.m9016l(d76Var);
                                x66 x66Var = d76Var.f16831L;
                                int length = bArrM9797j0.length;
                                x66Var.m12505b(Integer.valueOf(length), "Uploading data. size");
                                httpURLConnection.setDoOutput(true);
                                httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                                httpURLConnection.setFixedLengthStreamingMode(length);
                                httpURLConnection.connect();
                                OutputStream outputStream5 = httpURLConnection.getOutputStream();
                                try {
                                    outputStream5.write(bArrM9797j0);
                                    outputStream5.close();
                                    outputStream = null;
                                    try {
                                        responseCode = httpURLConnection.getResponseCode();
                                        try {
                                            try {
                                                headerFields = httpURLConnection.getHeaderFields();
                                                try {
                                                    byteArrayOutputStream = new ByteArrayOutputStream();
                                                    inputStream = httpURLConnection.getInputStream();
                                                    try {
                                                        bArr = new byte[1024];
                                                        while (true) {
                                                            i = inputStream.read(bArr);
                                                            if (i > 0) {
                                                                byteArrayOutputStream.write(bArr, 0, i);
                                                            } else {
                                                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                                inputStream.close();
                                                                httpURLConnection.disconnect();
                                                                String str5 = this.f31343d;
                                                                ea6Var = oa6Var2.f26515g;
                                                                oa6.m9016l(ea6Var);
                                                                v66Var = new v66(str5, k76Var, responseCode, null, byteArray, headerFields);
                                                            }
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        if (inputStream != null) {
                                                            inputStream.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    inputStream = null;
                                                }
                                            } catch (IOException e) {
                                                iOException = e;
                                                r110 = 0;
                                                if (outputStream != null) {
                                                    try {
                                                        outputStream.close();
                                                    } catch (IOException e2) {
                                                        d76 d76Var2 = oa6Var2.f26514f;
                                                        oa6.m9016l(d76Var2);
                                                        d76Var2.f16835j.m12506c("Error closing HTTP compressed POST connection output stream. appId", d76.m4401y(str4), e2);
                                                    }
                                                }
                                                if (httpURLConnection != null) {
                                                    httpURLConnection.disconnect();
                                                }
                                                String str6 = this.f31343d;
                                                ea6Var = oa6Var2.f26515g;
                                                oa6.m9016l(ea6Var);
                                                v66Var = new v66(str6, k76Var, responseCode, iOException, null, r110);
                                                break;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                r19 = 0;
                                                if (outputStream != null) {
                                                    try {
                                                        outputStream.close();
                                                    } catch (IOException e3) {
                                                        d76 d76Var3 = oa6Var2.f26514f;
                                                        oa6.m9016l(d76Var3);
                                                        d76Var3.f16835j.m12506c("Error closing HTTP compressed POST connection output stream. appId", d76.m4401y(str4), e3);
                                                    }
                                                    break;
                                                }
                                                if (httpURLConnection != null) {
                                                    httpURLConnection.disconnect();
                                                }
                                                String str7 = this.f31343d;
                                                ea6 ea6Var3 = oa6Var2.f26515g;
                                                oa6.m9016l(ea6Var3);
                                                ea6Var3.m5033D(new v66(str7, k76Var, responseCode, null, null, r19));
                                                throw th;
                                            }
                                        } catch (IOException e4) {
                                            iOException = e4;
                                            if (outputStream != null) {
                                                outputStream.close();
                                            }
                                            if (httpURLConnection != null) {
                                                httpURLConnection.disconnect();
                                            }
                                            String str8 = this.f31343d;
                                            ea6Var = oa6Var2.f26515g;
                                            oa6.m9016l(ea6Var);
                                            v66Var = new v66(str8, k76Var, responseCode, iOException, null, r110);
                                            break;
                                        } catch (Throwable th6) {
                                            th = th6;
                                            th = th;
                                            if (outputStream != null) {
                                                outputStream.close();
                                                break;
                                            }
                                            if (httpURLConnection != null) {
                                                httpURLConnection.disconnect();
                                            }
                                            String str9 = this.f31343d;
                                            ea6 ea6Var4 = oa6Var2.f26515g;
                                            oa6.m9016l(ea6Var4);
                                            ea6Var4.m5033D(new v66(str9, k76Var, responseCode, null, null, r19));
                                            throw th;
                                        }
                                    } catch (IOException e5) {
                                        e = e5;
                                        iOException = e;
                                        outputStream3 = outputStream;
                                        responseCode = 0;
                                        r110 = outputStream3;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        th = th;
                                        outputStream2 = outputStream;
                                        responseCode = 0;
                                        r19 = outputStream2;
                                        if (outputStream != null) {
                                            outputStream.close();
                                            break;
                                        }
                                        if (httpURLConnection != null) {
                                            httpURLConnection.disconnect();
                                        }
                                        String str10 = this.f31343d;
                                        ea6 ea6Var5 = oa6Var2.f26515g;
                                        oa6.m9016l(ea6Var5);
                                        ea6Var5.m5033D(new v66(str10, k76Var, responseCode, null, null, r19));
                                        throw th;
                                    }
                                } catch (IOException e6) {
                                    iOException = e6;
                                    outputStream = outputStream5;
                                    responseCode = 0;
                                    r110 = 0;
                                } catch (Throwable th8) {
                                    th = th8;
                                    outputStream = outputStream5;
                                    responseCode = 0;
                                    r19 = 0;
                                    th = th;
                                    if (outputStream != null) {
                                        outputStream.close();
                                        break;
                                    }
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    String str11 = this.f31343d;
                                    ea6 ea6Var6 = oa6Var2.f26515g;
                                    oa6.m9016l(ea6Var6);
                                    ea6Var6.m5033D(new v66(str11, k76Var, responseCode, null, null, r19));
                                    throw th;
                                }
                            } else {
                                outputStream = null;
                                responseCode = httpURLConnection.getResponseCode();
                                headerFields = httpURLConnection.getHeaderFields();
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                inputStream = httpURLConnection.getInputStream();
                                bArr = new byte[1024];
                                while (true) {
                                    i = inputStream.read(bArr);
                                    if (i > 0) {
                                        byteArrayOutputStream.write(bArr, 0, i);
                                    } else {
                                        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                                        inputStream.close();
                                        httpURLConnection.disconnect();
                                        String str12 = this.f31343d;
                                        ea6Var = oa6Var2.f26515g;
                                        oa6.m9016l(ea6Var);
                                        v66Var = new v66(str12, k76Var, responseCode, null, byteArray2, headerFields);
                                    }
                                }
                            }
                        } catch (IOException e7) {
                            e = e7;
                            outputStream = null;
                        } catch (Throwable th9) {
                            th = th9;
                            outputStream = null;
                        }
                        ea6Var.m5033D(v66Var);
                        return;
                    }
                    outputStream = null;
                    try {
                        throw new IOException("Failed to obtain HTTP connection");
                    } catch (IOException e8) {
                        e = e8;
                    } catch (Throwable th10) {
                        th = th10;
                        th = th;
                        httpURLConnection = outputStream;
                        outputStream2 = httpURLConnection;
                        responseCode = 0;
                        r19 = outputStream2;
                        if (outputStream != null) {
                            outputStream.close();
                            break;
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        String str13 = this.f31343d;
                        ea6 ea6Var7 = oa6Var2.f26515g;
                        oa6.m9016l(ea6Var7);
                        ea6Var7.m5033D(new v66(str13, k76Var, responseCode, null, null, r19));
                        throw th;
                    }
                } catch (IOException e9) {
                    e = e9;
                    outputStream = null;
                } catch (Throwable th11) {
                    th = th11;
                    outputStream = null;
                }
                iOException = e;
                httpURLConnection = outputStream;
                outputStream3 = httpURLConnection;
                responseCode = 0;
                r110 = outputStream3;
                if (outputStream != null) {
                    outputStream.close();
                    break;
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                String str14 = this.f31343d;
                ea6Var = oa6Var2.f26515g;
                oa6.m9016l(ea6Var);
                v66Var = new v66(str14, k76Var, responseCode, iOException, null, r110);
                ea6Var.m5033D(v66Var);
                return;
            default:
                String str15 = this.f31343d;
                wg6 wg6Var = (wg6) this.f31341b;
                oa6 oa6Var3 = (oa6) wg6Var.f36084a;
                oa6 oa6Var4 = (oa6) wg6Var.f36084a;
                ea6 ea6Var8 = oa6Var3.f26515g;
                oa6.m9016l(ea6Var8);
                ea6Var8.m5039y();
                try {
                    URLConnection uRLConnectionOpenConnection2 = ((URL) this.f31346g).openConnection();
                    if (!(uRLConnectionOpenConnection2 instanceof HttpURLConnection)) {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                    httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection2;
                    httpURLConnection2.setDefaultUseCaches(false);
                    op5 op5Var2 = oa6Var4.f26512d;
                    httpURLConnection2.setConnectTimeout(60000);
                    httpURLConnection2.setReadTimeout(61000);
                    httpURLConnection2.setInstanceFollowRedirects(false);
                    httpURLConnection2.setDoInput(true);
                    try {
                        try {
                            Map map3 = this.f31345f;
                            if (map3 != null) {
                                for (Map.Entry entry2 : map3.entrySet()) {
                                    httpURLConnection2.addRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                                }
                            }
                            byte[] bArr3 = (byte[]) this.f31342c;
                            if (bArr3 != null) {
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                                    gZIPOutputStream.write(bArr3);
                                    gZIPOutputStream.close();
                                    byteArrayOutputStream2.close();
                                    byte[] byteArray3 = byteArrayOutputStream2.toByteArray();
                                    d76 d76Var4 = oa6Var4.f26514f;
                                    oa6.m9016l(d76Var4);
                                    x66 x66Var2 = d76Var4.f16831L;
                                    int length2 = byteArray3.length;
                                    x66Var2.m12505b(Integer.valueOf(length2), "Uploading data. size");
                                    httpURLConnection2.setDoOutput(true);
                                    httpURLConnection2.addRequestProperty("Content-Encoding", "gzip");
                                    httpURLConnection2.setFixedLengthStreamingMode(length2);
                                    httpURLConnection2.connect();
                                    outputStream4 = httpURLConnection2.getOutputStream();
                                    try {
                                        outputStream4.write(byteArray3);
                                        outputStream4.close();
                                    } catch (IOException e10) {
                                        e = e10;
                                        httpURLConnection2 = httpURLConnection2;
                                        str2 = null;
                                        iOException2 = e;
                                        r6 = str2;
                                        if (outputStream4 != null) {
                                            try {
                                                outputStream4.close();
                                            } catch (IOException e11) {
                                                d76 d76Var5 = oa6Var4.f26514f;
                                                oa6.m9016l(d76Var5);
                                                d76Var5.f16835j.m12506c("Error closing HTTP compressed POST connection output stream. appId", d76.m4401y(str15), e11);
                                            }
                                            break;
                                        }
                                        if (httpURLConnection2 != null) {
                                            httpURLConnection2.disconnect();
                                        }
                                        m11089a(i2, iOException2, null, r6);
                                        return;
                                    } catch (Throwable th12) {
                                        th = th12;
                                        httpURLConnection2 = httpURLConnection2;
                                        str = null;
                                        th2 = th;
                                        r5 = str;
                                        if (outputStream4 != null) {
                                            try {
                                                outputStream4.close();
                                            } catch (IOException e12) {
                                                d76 d76Var6 = oa6Var4.f26514f;
                                                oa6.m9016l(d76Var6);
                                                d76Var6.f16835j.m12506c("Error closing HTTP compressed POST connection output stream. appId", d76.m4401y(str15), e12);
                                            }
                                            break;
                                        }
                                        if (httpURLConnection2 != null) {
                                            httpURLConnection2.disconnect();
                                        }
                                        m11089a(i2, null, null, r5);
                                        throw th2;
                                    }
                                } catch (IOException e13) {
                                    d76 d76Var7 = oa6Var4.f26514f;
                                    oa6.m9016l(d76Var7);
                                    d76Var7.f16835j.m12505b(e13, "Failed to gzip post request content");
                                    throw e13;
                                }
                            }
                            int responseCode2 = httpURLConnection2.getResponseCode();
                            try {
                                try {
                                    Map<String, List<String>> headerFields2 = httpURLConnection2.getHeaderFields();
                                    try {
                                        ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                                        inputStream2 = httpURLConnection2.getInputStream();
                                        try {
                                            byte[] bArr4 = new byte[1024];
                                            while (true) {
                                                int i3 = inputStream2.read(bArr4);
                                                if (i3 <= 0) {
                                                    byte[] byteArray4 = byteArrayOutputStream3.toByteArray();
                                                    inputStream2.close();
                                                    httpURLConnection2.disconnect();
                                                    m11089a(responseCode2, null, byteArray4, headerFields2);
                                                    return;
                                                }
                                                byteArrayOutputStream3.write(bArr4, 0, i3);
                                            }
                                        } catch (Throwable th13) {
                                            th = th13;
                                            if (inputStream2 != null) {
                                                inputStream2.close();
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th14) {
                                        th = th14;
                                        inputStream2 = null;
                                    }
                                } catch (IOException e14) {
                                    e = e14;
                                    httpURLConnection2 = httpURLConnection2;
                                    i2 = responseCode2;
                                    outputStream4 = null;
                                    str2 = str3;
                                    iOException2 = e;
                                    r6 = str2;
                                    if (outputStream4 != null) {
                                        outputStream4.close();
                                        break;
                                    }
                                    if (httpURLConnection2 != null) {
                                        httpURLConnection2.disconnect();
                                    }
                                    m11089a(i2, iOException2, null, r6);
                                    return;
                                } catch (Throwable th15) {
                                    th = th15;
                                    httpURLConnection2 = httpURLConnection2;
                                    i2 = responseCode2;
                                    outputStream4 = null;
                                    str = str3;
                                    th2 = th;
                                    r5 = str;
                                    if (outputStream4 != null) {
                                        outputStream4.close();
                                        break;
                                    }
                                    if (httpURLConnection2 != null) {
                                        httpURLConnection2.disconnect();
                                    }
                                    m11089a(i2, null, null, r5);
                                    throw th2;
                                }
                            } catch (IOException e15) {
                                e = e15;
                                i2 = responseCode2;
                                outputStream4 = null;
                                str2 = null;
                                iOException2 = e;
                                r6 = str2;
                                if (outputStream4 != null) {
                                    outputStream4.close();
                                    break;
                                }
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                m11089a(i2, iOException2, null, r6);
                                return;
                            } catch (Throwable th16) {
                                th = th16;
                                i2 = responseCode2;
                                outputStream4 = null;
                                str = null;
                                th2 = th;
                                r5 = str;
                                if (outputStream4 != null) {
                                    outputStream4.close();
                                    break;
                                }
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                m11089a(i2, null, null, r5);
                                throw th2;
                            }
                        } catch (IOException e16) {
                            e = e16;
                        }
                    } catch (Throwable th17) {
                        th = th17;
                    }
                } catch (IOException e17) {
                    iOException2 = e17;
                    httpURLConnection2 = null;
                    outputStream4 = null;
                    r6 = 0;
                } catch (Throwable th18) {
                    th2 = th18;
                    httpURLConnection2 = null;
                    outputStream4 = null;
                    r5 = 0;
                }
                break;
        }
    }

    public /* synthetic */ tq5(byte b) {
        this.f31340a = b;
    }

    public tq5(wg6 wg6Var, String str, URL url, byte[] bArr, HashMap map, rg6 rg6Var) {
        this.f31340a = (byte) 3;
        Objects.requireNonNull(wg6Var);
        this.f31341b = wg6Var;
        y42.m12851X(str);
        this.f31346g = url;
        this.f31342c = bArr;
        this.f31344e = rg6Var;
        this.f31343d = str;
        this.f31345f = map;
    }
}
