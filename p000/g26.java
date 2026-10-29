package p000;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class g26 extends ExperimentalUrlRequest.Builder {

    /* JADX INFO: renamed from: a */
    public fr0 f19522a;

    /* JADX INFO: renamed from: b */
    public String f19523b;

    /* JADX INFO: renamed from: c */
    public UrlRequest.Callback f19524c;

    /* JADX INFO: renamed from: d */
    public Executor f19525d;

    /* JADX INFO: renamed from: e */
    public String f19526e;

    /* JADX INFO: renamed from: f */
    public ArrayList f19527f;

    /* JADX INFO: renamed from: g */
    public boolean f19528g;

    /* JADX INFO: renamed from: h */
    public boolean f19529h;

    /* JADX INFO: renamed from: i */
    public int f19530i;

    /* JADX INFO: renamed from: j */
    public ArrayList f19531j;

    /* JADX INFO: renamed from: k */
    public UploadDataProvider f19532k;

    /* JADX INFO: renamed from: l */
    public Executor f19533l;

    /* JADX INFO: renamed from: m */
    public boolean f19534m;

    /* JADX INFO: renamed from: n */
    public boolean f19535n;

    /* JADX INFO: renamed from: o */
    public int f19536o;

    /* JADX INFO: renamed from: p */
    public boolean f19537p;

    /* JADX INFO: renamed from: q */
    public int f19538q;

    /* JADX INFO: renamed from: r */
    public RequestFinishedInfo.Listener f19539r;

    /* JADX INFO: renamed from: s */
    public byte[] f19540s;

    /* JADX INFO: renamed from: t */
    public ByteBuffer f19541t;

    /* JADX INFO: renamed from: u */
    public String f19542u;

    /* JADX INFO: renamed from: v */
    public long f19543v;

    /* JADX INFO: renamed from: w */
    public int f19544w;

    /* JADX INFO: renamed from: a */
    public final void m5893a(String str, String str2) {
        Objects.requireNonNull(str, "Invalid header name.");
        Objects.requireNonNull(str2, "Invalid header value.");
        if (!"Accept-Encoding".equalsIgnoreCase(str)) {
            this.f19527f.add(new AbstractMap.SimpleEntry(str, str2));
        } else if (Log.isLoggable("g26", 3)) {
            rw5.m10480b("g26", "It's not necessary to set Accept-Encoding on requests - cronet will do this automatically for you, and setting it yourself has no effect. See https://crbug.com/581399 for details.", new Exception());
        }
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder addHeader(String str, String str2) {
        m5893a(str, str2);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest.Builder addRequestAnnotation(Object obj) {
        Objects.requireNonNull(obj, "Invalid metrics annotation.");
        ArrayList arrayList = this.f19531j;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f19531j = arrayList;
        }
        arrayList.add(obj);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* synthetic */ ExperimentalUrlRequest.Builder allowDirectExecutor() {
        this.f19534m = true;
        return this;
    }

    @Override // org.chromium.net.UrlRequest.Builder
    public final /* synthetic */ UrlRequest.Builder bindToNetwork(long j) {
        this.f19543v = j;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest build() {
        int i = this.f19530i;
        ArrayList arrayList = this.f19531j;
        boolean z = this.f19528g;
        boolean z2 = this.f19529h;
        boolean z3 = this.f19534m;
        boolean z4 = this.f19535n;
        int i2 = this.f19536o;
        boolean z5 = this.f19537p;
        int i3 = this.f19538q;
        RequestFinishedInfo.Listener listener = this.f19539r;
        int i4 = this.f19544w;
        long j = this.f19543v;
        String str = this.f19526e;
        if (str == null) {
            str = "GET";
        }
        String str2 = str;
        UploadDataProvider uploadDataProvider = this.f19532k;
        Executor executor = this.f19533l;
        byte[] bArr = this.f19540s;
        ByteBuffer byteBuffer = this.f19541t;
        String str3 = this.f19542u;
        return this.f19522a.mo3890b(this.f19523b, this.f19524c, this.f19525d, i, arrayList, z, z2, z3, z4, i2, z5, i3, listener, i4, j, str2, this.f19527f, uploadDataProvider, executor, bArr, byteBuffer, str3);
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* synthetic */ ExperimentalUrlRequest.Builder disableCache() {
        this.f19528g = true;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder
    public final /* synthetic */ ExperimentalUrlRequest.Builder disableConnectionMigration() {
        this.f19529h = true;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest.Builder setHttpMethod(String str) {
        Objects.requireNonNull(str, "Method is required.");
        this.f19526e = str;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder
    public final /* synthetic */ ExperimentalUrlRequest.Builder setIdempotency(int i) {
        this.f19544w = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* synthetic */ ExperimentalUrlRequest.Builder setPriority(int i) {
        this.f19530i = i;
        return this;
    }

    @Override // org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ UrlRequest.Builder setRawCompressionDictionary(byte[] bArr, ByteBuffer byteBuffer, String str) {
        Objects.requireNonNull(bArr, "Hash is required");
        this.f19540s = bArr;
        if (bArr.length != 32) {
            C1077qn.m9987m("SHA-256 hashes are supposed to be 32 bytes");
            return null;
        }
        Objects.requireNonNull(byteBuffer, "Dictionary is required");
        this.f19541t = byteBuffer;
        z16.m13290b(byteBuffer);
        Objects.requireNonNull(str, "Dictionary ID cannot be null. If missing, pass an empty string");
        this.f19542u = str;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* synthetic */ ExperimentalUrlRequest.Builder setRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.f19539r = listener;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest.Builder setTrafficStatsTag(int i) {
        this.f19535n = true;
        this.f19536o = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest.Builder setTrafficStatsUid(int i) {
        this.f19537p = true;
        this.f19538q = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest.Builder setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor) {
        Objects.requireNonNull(uploadDataProvider, "Invalid UploadDataProvider.");
        this.f19532k = uploadDataProvider;
        Objects.requireNonNull(executor, "Invalid UploadDataProvider Executor.");
        this.f19533l = executor;
        if (this.f19526e == null) {
            this.f19526e = "POST";
        }
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* synthetic */ UrlRequest.Builder setPriority(int i) {
        this.f19530i = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* synthetic */ UrlRequest.Builder setRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.f19539r = listener;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ UrlRequest.Builder addHeader(String str, String str2) {
        m5893a(str, str2);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* synthetic */ UrlRequest.Builder allowDirectExecutor() {
        this.f19534m = true;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* synthetic */ UrlRequest.Builder disableCache() {
        this.f19528g = true;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final UrlRequest.Builder setTrafficStatsTag(int i) {
        this.f19535n = true;
        this.f19536o = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final UrlRequest.Builder setTrafficStatsUid(int i) {
        this.f19537p = true;
        this.f19538q = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ UrlRequest.Builder setHttpMethod(String str) {
        setHttpMethod(str);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final UrlRequest.Builder addRequestAnnotation(Object obj) {
        Objects.requireNonNull(obj, "Invalid metrics annotation.");
        ArrayList arrayList = this.f19531j;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f19531j = arrayList;
        }
        arrayList.add(obj);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final UrlRequest.Builder setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor) {
        Objects.requireNonNull(uploadDataProvider, "Invalid UploadDataProvider.");
        this.f19532k = uploadDataProvider;
        Objects.requireNonNull(executor, "Invalid UploadDataProvider Executor.");
        this.f19533l = executor;
        if (this.f19526e == null) {
            this.f19526e = "POST";
        }
        return this;
    }
}
