package p000;

import java.util.Collection;
import java.util.Collections;
import org.chromium.net.CronetException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class e26 extends RequestFinishedInfo {

    /* JADX INFO: renamed from: a */
    public String f17650a;

    /* JADX INFO: renamed from: b */
    public Collection f17651b;

    /* JADX INFO: renamed from: c */
    public qr0 f17652c;

    /* JADX INFO: renamed from: d */
    public byte f17653d;

    /* JADX INFO: renamed from: e */
    public UrlResponseInfo f17654e;

    /* JADX INFO: renamed from: f */
    public CronetException f17655f;

    @Override // org.chromium.net.RequestFinishedInfo
    public final Collection getAnnotations() {
        Collection collection = this.f17651b;
        return collection == null ? Collections.EMPTY_LIST : collection;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final CronetException getException() {
        return this.f17655f;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final int getFinishedReason() {
        return this.f17653d;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final UrlResponseInfo getResponseInfo() {
        return this.f17654e;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final String getUrl() {
        return this.f17650a;
    }
}
