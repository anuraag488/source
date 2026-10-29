package p000;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: renamed from: se */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1142se extends Handler {

    /* JADX INFO: renamed from: a */
    public static final C1142se f30187a = new C1142se();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int i;
        int iMin;
        CopyOnWriteArraySet copyOnWriteArraySet = AbstractC1105re.f29199a;
        String loggerName = logRecord.getLoggerName();
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue > level.intValue()) {
            i = 5;
        } else {
            i = logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        }
        String message = logRecord.getMessage();
        Throwable thrown = logRecord.getThrown();
        String strM6358x0 = (String) AbstractC1105re.f29200b.get(loggerName);
        if (strM6358x0 == null) {
            strM6358x0 = hd4.m6358x0(23, loggerName);
        }
        if (Log.isLoggable(strM6358x0, i)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int iM6342h0 = hd4.m6342h0(message, '\n', i2, 4);
                if (iM6342h0 == -1) {
                    iM6342h0 = length;
                }
                while (true) {
                    iMin = Math.min(iM6342h0, i2 + 4000);
                    Log.println(i, strM6358x0, message.substring(i2, iMin));
                    if (iMin >= iM6342h0) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
