package p000;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class kr6 extends ExperimentalBidirectionalStream.Builder {

    /* JADX INFO: renamed from: a */
    public final fr0 f23355a;

    /* JADX INFO: renamed from: b */
    public final String f23356b;

    /* JADX INFO: renamed from: c */
    public final BidirectionalStream.Callback f23357c;

    /* JADX INFO: renamed from: d */
    public final Executor f23358d;

    /* JADX INFO: renamed from: h */
    public boolean f23362h;

    /* JADX INFO: renamed from: i */
    public ArrayList f23363i;

    /* JADX INFO: renamed from: j */
    public boolean f23364j;

    /* JADX INFO: renamed from: k */
    public int f23365k;

    /* JADX INFO: renamed from: l */
    public boolean f23366l;

    /* JADX INFO: renamed from: m */
    public int f23367m;

    /* JADX INFO: renamed from: e */
    public final ArrayList f23359e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public String f23360f = "POST";

    /* JADX INFO: renamed from: g */
    public int f23361g = 3;

    /* JADX INFO: renamed from: n */
    public long f23368n = -1;

    public kr6(String str, BidirectionalStream.Callback callback, Executor executor, fr0 fr0Var) {
        Objects.requireNonNull(str, "URL is required.");
        this.f23356b = str;
        Objects.requireNonNull(callback, "Callback is required.");
        this.f23357c = callback;
        Objects.requireNonNull(executor, "Executor is required.");
        this.f23358d = executor;
        this.f23355a = fr0Var;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final BidirectionalStream.Builder addHeader(String str, String str2) {
        Objects.requireNonNull(str, "Invalid header name.");
        Objects.requireNonNull(str2, "Invalid header value.");
        this.f23359e.add(new AbstractMap.SimpleImmutableEntry(str, str2));
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final ExperimentalBidirectionalStream.Builder addRequestAnnotation(Object obj) {
        Objects.requireNonNull(obj, "Invalid metrics annotation.");
        ArrayList arrayList = this.f23363i;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f23363i = arrayList;
        }
        arrayList.add(obj);
        return this;
    }

    @Override // org.chromium.net.BidirectionalStream.Builder
    public final /* synthetic */ BidirectionalStream.Builder bindToNetwork(long j) {
        this.f23368n = j;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final ExperimentalBidirectionalStream build() {
        return this.f23355a.mo5788a(this.f23356b, this.f23357c, this.f23358d, this.f23360f, this.f23359e, this.f23361g, this.f23362h, this.f23363i, this.f23364j, this.f23365k, this.f23366l, this.f23367m, this.f23368n);
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* synthetic */ BidirectionalStream.Builder delayRequestHeadersUntilFirstFlush(boolean z) {
        this.f23362h = z;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final BidirectionalStream.Builder setHttpMethod(String str) {
        Objects.requireNonNull(str, "Method is required.");
        this.f23360f = str;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* synthetic */ BidirectionalStream.Builder setPriority(int i) {
        this.f23361g = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final ExperimentalBidirectionalStream.Builder setTrafficStatsTag(int i) {
        this.f23364j = true;
        this.f23365k = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final ExperimentalBidirectionalStream.Builder setTrafficStatsUid(int i) {
        this.f23366l = true;
        this.f23367m = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* synthetic */ ExperimentalBidirectionalStream.Builder delayRequestHeadersUntilFirstFlush(boolean z) {
        this.f23362h = z;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* synthetic */ ExperimentalBidirectionalStream.Builder setPriority(int i) {
        this.f23361g = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* bridge */ /* synthetic */ BidirectionalStream.Builder setTrafficStatsTag(int i) {
        setTrafficStatsTag(i);
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* bridge */ /* synthetic */ BidirectionalStream.Builder setTrafficStatsUid(int i) {
        setTrafficStatsUid(i);
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final ExperimentalBidirectionalStream.Builder setHttpMethod(String str) {
        Objects.requireNonNull(str, "Method is required.");
        this.f23360f = str;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* bridge */ /* synthetic */ BidirectionalStream.Builder addRequestAnnotation(Object obj) {
        addRequestAnnotation(obj);
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final ExperimentalBidirectionalStream.Builder addHeader(String str, String str2) {
        Objects.requireNonNull(str, "Invalid header name.");
        Objects.requireNonNull(str2, "Invalid header value.");
        this.f23359e.add(new AbstractMap.SimpleImmutableEntry(str, str2));
        return this;
    }
}
