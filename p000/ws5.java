package p000;

import android.net.TrafficStats;
import android.os.Trace;
import android.util.Log;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.invoke.VarHandle;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import org.chromium.net.impl.CronetUrlRequestContext;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ws5 extends HttpURLConnection {

    /* JADX INFO: renamed from: a */
    public final CronetUrlRequestContext f33694a;

    /* JADX INFO: renamed from: b */
    public final lt5 f33695b;

    /* JADX INFO: renamed from: c */
    public ExperimentalUrlRequest f33696c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f33697d;

    /* JADX INFO: renamed from: e */
    public boolean f33698e;

    /* JADX INFO: renamed from: f */
    public int f33699f;

    /* JADX INFO: renamed from: g */
    public boolean f33700g;

    /* JADX INFO: renamed from: h */
    public int f33701h;

    /* JADX INFO: renamed from: i */
    public final et5 f33702i;

    /* JADX INFO: renamed from: j */
    public ht5 f33703j;

    /* JADX INFO: renamed from: k */
    public UrlResponseInfo f33704k;

    /* JADX INFO: renamed from: l */
    public IOException f33705l;

    /* JADX INFO: renamed from: m */
    public boolean f33706m;

    /* JADX INFO: renamed from: n */
    public boolean f33707n;

    /* JADX INFO: renamed from: o */
    public List f33708o;

    /* JADX INFO: renamed from: p */
    public Map f33709p;

    public ws5(URL url, CronetUrlRequestContext cronetUrlRequestContext) {
        super(url);
        ry5.m10503a("CronetHttpURLConnection#CronetHttpURLConnection");
        try {
            this.f33694a = cronetUrlRequestContext;
            lt5 lt5Var = new lt5();
            lt5Var.f24361a = new LinkedBlockingQueue();
            VarHandle.storeStoreFence();
            this.f33695b = lt5Var;
            et5 et5Var = new et5();
            et5Var.f18478a = this;
            VarHandle.storeStoreFence();
            this.f33702i = et5Var;
            this.f33697d = new ArrayList();
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        m12417i(str, str2, false);
    }

    @Override // java.net.URLConnection
    public final void connect() {
        getOutputStream();
        m12418j();
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        if (((HttpURLConnection) this).connected) {
            this.f33696c.cancel();
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m12413e(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f33697d;
            if (i >= arrayList.size()) {
                return -1;
            }
            if (((String) ((Pair) arrayList.get(i)).first).equalsIgnoreCase(str)) {
                return i;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: f */
    public final List m12414f() {
        List list = this.f33708o;
        if (list != null) {
            return list;
        }
        this.f33708o = new ArrayList();
        for (Map.Entry<String, String> entry : this.f33704k.getAllHeadersAsList()) {
            if (!entry.getKey().equalsIgnoreCase("Content-Encoding")) {
                this.f33708o.add(new AbstractMap.SimpleImmutableEntry(entry));
            }
        }
        List listUnmodifiableList = Collections.unmodifiableList(this.f33708o);
        this.f33708o = listUnmodifiableList;
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: g */
    public final Map m12415g() {
        Map map = this.f33709p;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry entry : m12414f()) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add((String) entry.getValue());
            treeMap.put((String) entry.getKey(), Collections.unmodifiableList(arrayList));
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(treeMap);
        this.f33709p = mapUnmodifiableMap;
        return mapUnmodifiableMap;
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        try {
            m12416h();
            if (this.f33704k.getHttpStatusCode() >= 400) {
                return this.f33702i;
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        try {
            m12416h();
            Map mapM12415g = m12415g();
            if (!mapM12415g.containsKey(str)) {
                return null;
            }
            List list = (List) mapM12415g.get(str);
            return (String) list.get(list.size() - 1);
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) {
        Map.Entry entry;
        try {
            m12416h();
            List listM12414f = m12414f();
            entry = i >= listM12414f.size() ? null : (Map.Entry) listM12414f.get(i);
        } catch (IOException unused) {
        }
        if (entry == null) {
            return null;
        }
        return (String) entry.getKey();
    }

    @Override // java.net.URLConnection
    public final Map getHeaderFields() {
        try {
            m12416h();
            return m12415g();
        } catch (IOException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() throws IOException {
        m12416h();
        if (!((HttpURLConnection) this).instanceFollowRedirects && this.f33706m) {
            wb1.m12191j("Cannot read response body of a redirect.");
            return null;
        }
        if (this.f33704k.getHttpStatusCode() < 400) {
            return this.f33702i;
        }
        throw new FileNotFoundException(((HttpURLConnection) this).url.toString());
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() throws ProtocolException {
        if (this.f33703j == null && ((HttpURLConnection) this).doOutput) {
            if (((HttpURLConnection) this).connected) {
                throw new ProtocolException("Cannot write to OutputStream after receiving response.");
            }
            int i = ((HttpURLConnection) this).chunkLength;
            lt5 lt5Var = this.f33695b;
            if (i > 0) {
                int i2 = ((HttpURLConnection) this).chunkLength;
                zr5 zr5Var = new zr5();
                zr5Var.f36322f = new cr5((ht5) zr5Var, (byte) 1);
                if (i2 <= 0) {
                    C1077qn.m9987m("chunkLength should be greater than 0");
                    return null;
                }
                zr5Var.f36321e = ByteBuffer.allocate(i2);
                zr5Var.f36320d = lt5Var;
                VarHandle.storeStoreFence();
                this.f33703j = zr5Var;
                m12418j();
            } else {
                long j = ((HttpURLConnection) this).fixedContentLength;
                long j2 = ((HttpURLConnection) this).fixedContentLengthLong;
                if (j2 != -1) {
                    j = j2;
                }
                if (j != -1) {
                    ls5 ls5Var = new ls5();
                    ls5Var.f24338g = new cr5((ht5) ls5Var, (byte) 2);
                    if (j < 0) {
                        C1077qn.m9987m("Content length must be larger than 0 for non-chunked upload.");
                        return null;
                    }
                    ls5Var.f24336e = j;
                    ls5Var.f24337f = ByteBuffer.allocate((int) Math.min(j, 16384L));
                    ls5Var.f24335d = lt5Var;
                    ls5Var.f24339h = 0L;
                    VarHandle.storeStoreFence();
                    this.f33703j = ls5Var;
                    m12418j();
                } else {
                    if (Log.isLoggable("ws5", 3)) {
                        rw5.m10480b("ws5", "Outputstream is being buffered in memory.", new Object[0]);
                    }
                    String requestProperty = getRequestProperty("Content-Length");
                    if (requestProperty == null) {
                        fr5 fr5Var = new fr5();
                        fr5Var.f19242f = new cr5((ht5) fr5Var, (byte) 0);
                        fr5Var.f19241e = this;
                        fr5Var.f19240d = -1;
                        fr5Var.f19243g = ByteBuffer.allocate(16384);
                        VarHandle.storeStoreFence();
                        this.f33703j = fr5Var;
                    } else {
                        long j3 = Long.parseLong(requestProperty);
                        fr5 fr5Var2 = new fr5();
                        fr5Var2.f19242f = new cr5((ht5) fr5Var2, (byte) 0);
                        if (j3 > 2147483647L) {
                            C1077qn.m9987m("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2GB.");
                            return null;
                        }
                        if (j3 < 0) {
                            C1077qn.m9987m("Content length < 0.");
                            return null;
                        }
                        fr5Var2.f19241e = this;
                        int i3 = (int) j3;
                        fr5Var2.f19240d = i3;
                        fr5Var2.f19243g = ByteBuffer.allocate(i3);
                        VarHandle.storeStoreFence();
                        this.f33703j = fr5Var2;
                    }
                }
            }
        }
        return this.f33703j;
    }

    @Override // java.net.URLConnection
    public final Map getRequestProperties() {
        if (((HttpURLConnection) this).connected) {
            C1077qn.m9989o("Cannot access request headers after connection is set.");
            return null;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        ArrayList arrayList = this.f33697d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Pair pair = (Pair) obj;
            if (treeMap.containsKey(pair.first)) {
                C1077qn.m9989o("Should not have multiple values.");
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add((String) pair.second);
            treeMap.put((String) pair.first, Collections.unmodifiableList(arrayList2));
        }
        return Collections.unmodifiableMap(treeMap);
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        int iM12413e = m12413e(str);
        if (iM12413e >= 0) {
            return (String) ((Pair) this.f33697d.get(iM12413e)).second;
        }
        return null;
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        m12416h();
        return this.f33704k.getHttpStatusCode();
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        m12416h();
        return this.f33704k.getHttpStatusText();
    }

    /* JADX INFO: renamed from: h */
    public final void m12416h() {
        ry5.m10503a("CronetHttpURLConnection#getResponse");
        try {
            ht5 ht5Var = this.f33703j;
            if (ht5Var != null) {
                ht5Var.mo6504b();
                this.f33703j.close();
            }
            if (!this.f33707n) {
                m12418j();
                this.f33695b.m8107a(0);
            }
            if (!this.f33707n) {
                throw new IllegalStateException("No response.");
            }
            IOException iOException = this.f33705l;
            if (iOException != null) {
                throw iOException;
            }
            if (this.f33704k == null) {
                throw new NullPointerException("Response info is null when there is no exception.");
            }
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m12417i(String str, String str2, boolean z) {
        if (((HttpURLConnection) this).connected) {
            C1077qn.m9989o("Cannot modify request property after connection is made.");
            return;
        }
        int iM12413e = m12413e(str);
        ArrayList arrayList = this.f33697d;
        if (iM12413e >= 0) {
            if (!z) {
                qm5.m9919j(zi4.m13621u("Cannot add multiple headers of the same key, ", str, ". crbug.com/432719."));
                return;
            }
            arrayList.remove(iM12413e);
        }
        arrayList.add(Pair.create(str, str2));
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cf A[Catch: all -> 0x00f1, TryCatch #0 {all -> 0x00f1, blocks: (B:12:0x0018, B:14:0x0035, B:16:0x003f, B:17:0x0043, B:20:0x0049, B:22:0x0056, B:27:0x005f, B:31:0x007c, B:33:0x0082, B:28:0x0071, B:30:0x0077, B:34:0x0087, B:36:0x008f, B:37:0x00a3, B:39:0x00a9, B:40:0x00ac, B:48:0x00c5, B:49:0x00ca, B:57:0x00dd, B:58:0x00e2, B:52:0x00cf, B:54:0x00d5, B:55:0x00d9, B:43:0x00b7, B:45:0x00bd, B:46:0x00c1), top: B:67:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d5 A[Catch: all -> 0x00f1, TryCatch #0 {all -> 0x00f1, blocks: (B:12:0x0018, B:14:0x0035, B:16:0x003f, B:17:0x0043, B:20:0x0049, B:22:0x0056, B:27:0x005f, B:31:0x007c, B:33:0x0082, B:28:0x0071, B:30:0x0077, B:34:0x0087, B:36:0x008f, B:37:0x00a3, B:39:0x00a9, B:40:0x00ac, B:48:0x00c5, B:49:0x00ca, B:57:0x00dd, B:58:0x00e2, B:52:0x00cf, B:54:0x00d5, B:55:0x00d9, B:43:0x00b7, B:45:0x00bd, B:46:0x00c1), top: B:67:0x0018 }] */
    /* JADX INFO: renamed from: j */
    public final void m12418j() {
        int threadStatsUid;
        if (((HttpURLConnection) this).connected) {
            return;
        }
        ht5 ht5Var = this.f33703j;
        if (ht5Var == null || ht5Var.mo5799e()) {
            ry5.m10503a("CronetHttpURLConnection#startRequest");
            try {
                CronetUrlRequestContext cronetUrlRequestContext = this.f33694a;
                String string = getURL().toString();
                rs5 rs5Var = new rs5(this);
                lt5 lt5Var = this.f33695b;
                ExperimentalUrlRequest.Builder builder = (ExperimentalUrlRequest.Builder) cronetUrlRequestContext.newUrlRequestBuilder(string, (UrlRequest.Callback) rs5Var, (Executor) lt5Var);
                int i = 0;
                if (((HttpURLConnection) this).doOutput) {
                    if (((HttpURLConnection) this).method.equals("GET")) {
                        ((HttpURLConnection) this).method = "POST";
                    }
                    ht5 ht5Var2 = this.f33703j;
                    if (ht5Var2 != null) {
                        builder.setUploadDataProvider(ht5Var2.mo5798a(), (Executor) lt5Var);
                        if (getRequestProperty("Content-Length") == null) {
                            if (!(((HttpURLConnection) this).chunkLength > 0)) {
                                m12417i("Content-Length", Long.toString(this.f33703j.mo5798a().getLength()), false);
                            }
                        }
                    } else if (getRequestProperty("Content-Length") == null) {
                        m12417i("Content-Length", "0", false);
                    }
                    if (getRequestProperty("Content-Type") == null) {
                        m12417i("Content-Type", "application/x-www-form-urlencoded", false);
                    }
                }
                ArrayList arrayList = this.f33697d;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    Pair pair = (Pair) obj;
                    builder.addHeader((String) pair.first, (String) pair.second);
                }
                if (!getUseCaches()) {
                    builder.disableCache();
                }
                builder.setHttpMethod(((HttpURLConnection) this).method);
                if (!this.f33698e) {
                    int threadStatsTag = TrafficStats.getThreadStatsTag();
                    if (threadStatsTag != -1) {
                        this.f33699f = threadStatsTag;
                        this.f33698e = true;
                    }
                    if (this.f33698e) {
                    }
                    if (!this.f33700g) {
                        threadStatsUid = TrafficStats.getThreadStatsUid();
                        if (threadStatsUid != -1) {
                            this.f33701h = threadStatsUid;
                            this.f33700g = true;
                        }
                        if (this.f33700g) {
                        }
                        ExperimentalUrlRequest experimentalUrlRequestBuild = builder.build();
                        this.f33696c = experimentalUrlRequestBuild;
                        experimentalUrlRequestBuild.start();
                        ((HttpURLConnection) this).connected = true;
                        Trace.endSection();
                    }
                    builder.setTrafficStatsUid(this.f33701h);
                    ExperimentalUrlRequest experimentalUrlRequestBuild2 = builder.build();
                    this.f33696c = experimentalUrlRequestBuild2;
                    experimentalUrlRequestBuild2.start();
                    ((HttpURLConnection) this).connected = true;
                    Trace.endSection();
                }
                builder.setTrafficStatsTag(this.f33699f);
                if (!this.f33700g) {
                    threadStatsUid = TrafficStats.getThreadStatsUid();
                    if (threadStatsUid != -1) {
                        this.f33701h = threadStatsUid;
                        this.f33700g = true;
                    }
                    if (this.f33700g) {
                    }
                    ExperimentalUrlRequest experimentalUrlRequestBuild3 = builder.build();
                    this.f33696c = experimentalUrlRequestBuild3;
                    experimentalUrlRequestBuild3.start();
                    ((HttpURLConnection) this).connected = true;
                    Trace.endSection();
                }
                builder.setTrafficStatsUid(this.f33701h);
                ExperimentalUrlRequest experimentalUrlRequestBuild4 = builder.build();
                this.f33696c = experimentalUrlRequestBuild4;
                experimentalUrlRequestBuild4.start();
                ((HttpURLConnection) this).connected = true;
                Trace.endSection();
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i) {
        rw5.m10480b("ws5", "setConnectTimeout is not supported by CronetHttpURLConnection", new Object[0]);
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        m12417i(str, str2, true);
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return false;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        Map.Entry entry;
        try {
            m12416h();
            List listM12414f = m12414f();
            entry = i >= listM12414f.size() ? null : (Map.Entry) listM12414f.get(i);
        } catch (IOException unused) {
        }
        if (entry == null) {
            return null;
        }
        return (String) entry.getValue();
    }
}
