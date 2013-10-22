/*
 * <copyright>
 *  
 *  Copyright 1997-2004 BBNT Solutions, LLC
 *  under sponsorship of the Defense Advanced Research Projects
 *  Agency (DARPA).
 * 
 *  You can redistribute this software and/or modify it under the
 *  terms of the Cougaar Open Source License as published on the
 *  Cougaar Open Source Website (www.cougaar.org).
 * 
 *  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 *  "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 *  LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 *  A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 *  OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 *  SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 *  LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 *  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 *  THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 *  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 *  OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *  
 * </copyright>
 */
 
package org.cougaar.planning.ldm.plan;
 
import org.cougaar.planning.ldm.measure.Latitude;
import org.cougaar.planning.ldm.measure.Longitude;
 
public class LatLonPointImpl 
  implements LatLonPoint, NewLatLonPoint, java.io.Serializable
{
	
  protected Latitude lat = null;
  protected Longitude lon = null;
	
  public LatLonPointImpl() {
    super();
  }
	
  public LatLonPointImpl(Latitude la, Longitude lo) {
    lat = la;
    lon = lo;
  } 
	
  /** @return Latitude - the Latitude representing this location */
  public Latitude getLatitude() {
    return lat;
  }	
	
  /** @return Longitude - the Longitude representing this location */
  public Longitude getLongitude() {
    return lon;
  }
	
  /** @param latitude - set the Latitude representing this location */
  public void setLatitude(Latitude latitude) {
    lat = latitude;
  }
	
  /** @param longitude - set the Longitude representing this location */
  public void setLongitude(Longitude longitude) {
    lon = longitude;
  }
	
  public Object clone() {
    return new LatLonPointImpl(lat, lon);
  }

  public String toString() {
    return "<"+lat+", "+lon+">";
  }

}