package p000;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: mu */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0922mu {

    /* JADX INFO: renamed from: a */
    public long f25214a;

    /* JADX INFO: renamed from: a */
    public static C0922mu m8399a(BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        long j = Long.parseLong(jsonReader.nextString());
                        C0922mu c0922mu = new C0922mu();
                        c0922mu.f25214a = j;
                        VarHandle.storeStoreFence();
                        jsonReader.close();
                        return c0922mu;
                    }
                    long jNextLong = jsonReader.nextLong();
                    C0922mu c0922mu2 = new C0922mu();
                    c0922mu2.f25214a = jNextLong;
                    VarHandle.storeStoreFence();
                    jsonReader.close();
                    return c0922mu2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th) {
            jsonReader.close();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C0922mu) && this.f25214a == ((C0922mu) obj).f25214a;
    }

    public final int hashCode() {
        long j = this.f25214a;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public final String toString() {
        return d55.m4369n(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.f25214a, "}");
    }
}
